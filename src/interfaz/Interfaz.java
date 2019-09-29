package interfaz;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author vick08bv
 */
public class Interfaz extends javax.swing.JFrame {
    
    private boolean cambios;
    private File f;
    private Manejador m;
    private HashMap<String, ArrayList<String>> map;

    /**
     * Creates new form Practica3
     */
    public Interfaz() {
        
        initComponents();
        
        cambios = false;
        m = new Manejador();
        
        setTitle("Diccionario de sinónimos");
        
        setLocationRelativeTo(null);

        setResizable(false);

        cerrar.setEnabled(false);
        guardar.setEnabled(false);
        guardarComo.setEnabled(false);
        buscar.setEnabled(false);
        anadir.setEnabled(false);
        eliminarValor.setEnabled(false);
        eliminarClave.setEnabled(false);
        editorClaves.setEditable(false);
        editorValores.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        editorClaves = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        eliminarClave = new javax.swing.JButton();
        clave = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        editorValores = new javax.swing.JTextField();
        anadir = new javax.swing.JButton();
        eliminarValor = new javax.swing.JButton();
        claveActual = new javax.swing.JTextField();
        palabraActual = new javax.swing.JTextField();
        ayuda = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        sinonimos = new javax.swing.JTextField();
        menu = new javax.swing.JMenuBar();
        archivos = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        cerrar = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        guardarComo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(225, 225, 245));

        texto.setEditable(false);
        texto.setBackground(new java.awt.Color(225, 225, 245));
        texto.setColumns(5);
        texto.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(47, 2, 2));
        texto.setLineWrap(true);
        texto.setRows(5);
        texto.setTabSize(2);
        texto.setBorder(null);
        panel.setViewportView(texto);

        editorClaves.setBackground(new java.awt.Color(225, 225, 245));
        editorClaves.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editorClaves.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editorClaves.setBorder(null);
        editorClaves.setPreferredSize(new java.awt.Dimension(100, 25));

        buscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        buscar.setForeground(new java.awt.Color(51, 51, 51));
        buscar.setText("Buscar");
        buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        eliminarClave.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        eliminarClave.setForeground(new java.awt.Color(255, 0, 0));
        eliminarClave.setText("Borrar");
        eliminarClave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClaveActionPerformed(evt);
            }
        });

        clave.setEditable(false);
        clave.setBackground(new java.awt.Color(225, 225, 245));
        clave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clave.setForeground(new java.awt.Color(0, 0, 204));
        clave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clave.setText("Clave");
        clave.setBorder(null);
        clave.setOpaque(false);
        clave.setPreferredSize(new java.awt.Dimension(50, 25));

        valor.setEditable(false);
        valor.setBackground(new java.awt.Color(225, 225, 245));
        valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor.setForeground(new java.awt.Color(0, 0, 204));
        valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor.setText("Valor");
        valor.setBorder(null);
        valor.setOpaque(false);
        valor.setPreferredSize(new java.awt.Dimension(50, 25));

        editorValores.setBackground(new java.awt.Color(225, 225, 245));
        editorValores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editorValores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editorValores.setBorder(null);
        editorValores.setPreferredSize(new java.awt.Dimension(100, 25));

        anadir.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        anadir.setForeground(new java.awt.Color(51, 51, 51));
        anadir.setText("Añadir");
        anadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });

        eliminarValor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        eliminarValor.setForeground(new java.awt.Color(255, 0, 0));
        eliminarValor.setText("Borrar");
        eliminarValor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarValorActionPerformed(evt);
            }
        });

        claveActual.setEditable(false);
        claveActual.setBackground(new java.awt.Color(225, 225, 245));
        claveActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        claveActual.setForeground(new java.awt.Color(47, 2, 2));
        claveActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        claveActual.setBorder(null);

        palabraActual.setEditable(false);
        palabraActual.setBackground(new java.awt.Color(225, 225, 245));
        palabraActual.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        palabraActual.setForeground(new java.awt.Color(30, 1, 1));
        palabraActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        palabraActual.setText("Palabra actual:");
        palabraActual.setBorder(null);
        palabraActual.setOpaque(false);

        ayuda.setBackground(new java.awt.Color(225, 225, 245));
        ayuda.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        ayuda.setForeground(new java.awt.Color(0, 0, 204));
        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pregunta.png"))); // NOI18N
        ayuda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ayuda.setContentAreaFilled(false);

        imagen.setBackground(new java.awt.Color(225, 225, 245));
        imagen.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        imagen.setForeground(new java.awt.Color(47, 2, 2));
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/juegoPalabras.png"))); // NOI18N
        imagen.setToolTipText("");
        imagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imagen.setPreferredSize(new java.awt.Dimension(120, 40));

        sinonimos.setEditable(false);
        sinonimos.setBackground(new java.awt.Color(225, 225, 245));
        sinonimos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        sinonimos.setForeground(new java.awt.Color(30, 1, 1));
        sinonimos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sinonimos.setText("Sinónimos:");
        sinonimos.setBorder(null);
        sinonimos.setOpaque(false);

        archivos.setText("  Archivos");

        abrir.setText("Abrir archivo");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        archivos.add(abrir);

        cerrar.setText("Cerrar archivo");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        archivos.add(cerrar);

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        archivos.add(guardar);

        guardarComo.setText("Guardar como...");
        guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComoActionPerformed(evt);
            }
        });
        archivos.add(guardarComo);

        menu.add(archivos);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editorClaves, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editorValores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(claveActual, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sinonimos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(palabraActual, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(palabraActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(claveActual, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editorClaves, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editorValores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinonimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel)))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Abrir archivo");
        chooser.setFileFilter(new FileNameExtensionFilter("csv", "CSV"));
           
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            
            File archivo = chooser.getSelectedFile();
            
            try{
                
                if(archivo != null){
                    
                    f = archivo;
                    m.leer(archivo);
                    cerrar.setEnabled(true);
                    guardar.setEnabled(true);
                    guardarComo.setEnabled(true);
                    buscar.setEnabled(true);
                    editorClaves.setEditable(true);
                    editorValores.setEditable(true);
                    
                    texto.setText("\n  Archivo abierto.\n     "
                                + "Realiza una\n     búsqueda!");
                
                    
                }
                
            }catch(Exception e){
                
                JOptionPane.showConfirmDialog(null, "No se pudo abrir el archivo", 
                   "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                
            }
            
        }
        
    }//GEN-LAST:event_abrirActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        
        int opcion = 0;
        
        if(cambios){
        
            opcion = JOptionPane.showConfirmDialog(null, "Hay cambios sin guardar, ¿Cerrar?", 
                          "¿Cerrar el diccionario?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            
        }
        
        if (opcion == 0){
        
            f = null;
            m = new Manejador();
        
            guardar.setEnabled(false);
            guardarComo.setEnabled(false);
            buscar.setEnabled(false);
            anadir.setEnabled(false);
            eliminarValor.setEnabled(false);
            eliminarClave.setEnabled(false);
            editorClaves.setText("");
            editorValores.setText("");
            editorClaves.setEditable(false);
            editorValores.setEditable(false);
            claveActual.setText("");
            texto.setText("");
            cerrar.setEnabled(false);
    
            texto.setText("\n Archivo cerrado.");
                
        }
            
    }//GEN-LAST:event_cerrarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        String palabraBuscada = editorClaves.getText();
        
        if(palabraBuscada.equals("")){
        
            anadir.setEnabled(false);
            eliminarValor.setEnabled(false);
            eliminarClave.setEnabled(false);
            claveActual.setText("");
            
        } else {
            
            anadir.setEnabled(true);
            eliminarValor.setEnabled(true);
            eliminarClave.setEnabled(true);
        
            claveActual.setText(editorClaves.getText().toLowerCase());
        
            texto.setText(m.buscar(editorClaves.getText()));
            
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClaveActionPerformed
        
        cambios = true;
        
        m.borrarClave(claveActual.getText());
        
        claveActual.setText("");
        texto.setText("");
        
    }//GEN-LAST:event_eliminarClaveActionPerformed

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        
        cambios = true;
        
        String palabras = editorValores.getText().toLowerCase();
        
        palabras = palabras.replace(" ", "");
        m.anadirValores(claveActual.getText(), palabras.split(","));
        
        texto.setText(m.buscar(claveActual.getText()));
        
    }//GEN-LAST:event_anadirActionPerformed

    private void eliminarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarValorActionPerformed
        
        cambios = true;
        
        String palabras = editorValores.getText().toLowerCase();
        
        palabras = palabras.replace(" ", "");
        m.borrarValores(claveActual.getText(), palabras.split(","));
        
        texto.setText(m.buscar(claveActual.getText()));
        
    }//GEN-LAST:event_eliminarValorActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        m.guardar(f.getAbsolutePath());
        cambios = false;
        
        texto.setText("\n     Diccionario\n      guardado.");
                
    }//GEN-LAST:event_guardarActionPerformed

    private void guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComoActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        
        chooser.setDialogTitle("Guardar diccionario");

        chooser.setSelectedFile(new File(f.getName()));
        
        if(chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            
            m.guardar(chooser.getSelectedFile().getAbsolutePath());
            
            cambios = false;
        }   
        
        texto.setText("\n     Diccionario\n      guardado.");
                
    }//GEN-LAST:event_guardarComoActionPerformed

    /**
     * @param args the command line arguments.
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JButton anadir;
    private javax.swing.JMenu archivos;
    private javax.swing.JButton ayuda;
    private javax.swing.JButton buscar;
    private javax.swing.JMenuItem cerrar;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField claveActual;
    private javax.swing.JTextField editorClaves;
    private javax.swing.JTextField editorValores;
    private javax.swing.JButton eliminarClave;
    private javax.swing.JButton eliminarValor;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JMenuItem guardarComo;
    private javax.swing.JLabel imagen;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextField palabraActual;
    private javax.swing.JScrollPane panel;
    private javax.swing.JTextField sinonimos;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
