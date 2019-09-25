/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author usr
 */
public class Interfaz extends javax.swing.JFrame {
    
    private File f;
    private Manejador m;
    private HashMap<String, ArrayList<String>> map;

    /**
     * Creates new form Practica3
     */
    public Interfaz() {
        
        initComponents();
        
        m = new Manejador();
        
        setTitle("Diccionario de sinónimos");
        
        setLocationRelativeTo(null);

        setResizable(false);
        
        //String cadena = "";
        //for(String clave: map.keySet()){
        
            //cadena += clave + " -> " + map.get(clave) + "\n";
        
        //}

        //texto.setText(cadena);
        
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
        jPanel1 = new javax.swing.JPanel();
        palabraActual = new javax.swing.JTextField();
        menu = new javax.swing.JMenuBar();
        archivos = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        cerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 232, 239));

        texto.setEditable(false);
        texto.setBackground(new java.awt.Color(230, 229, 238));
        texto.setColumns(5);
        texto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        texto.setRows(5);
        texto.setBorder(null);
        panel.setViewportView(texto);

        editorClaves.setBackground(new java.awt.Color(234, 235, 243));
        editorClaves.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editorClaves.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editorClaves.setBorder(null);
        editorClaves.setPreferredSize(new java.awt.Dimension(100, 25));

        buscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(51, 51, 51));
        buscar.setText("Buscar");
        buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        eliminarClave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eliminarClave.setForeground(new java.awt.Color(255, 0, 0));
        eliminarClave.setText("Eliminar");
        eliminarClave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clave.setEditable(false);
        clave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clave.setForeground(new java.awt.Color(0, 0, 204));
        clave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clave.setText("Clave");
        clave.setBorder(null);
        clave.setPreferredSize(new java.awt.Dimension(50, 25));

        valor.setEditable(false);
        valor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valor.setForeground(new java.awt.Color(0, 0, 204));
        valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor.setText("Valor");
        valor.setBorder(null);
        valor.setPreferredSize(new java.awt.Dimension(50, 25));

        editorValores.setBackground(new java.awt.Color(233, 232, 239));
        editorValores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editorValores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editorValores.setBorder(null);
        editorValores.setPreferredSize(new java.awt.Dimension(100, 25));

        anadir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        anadir.setForeground(new java.awt.Color(51, 51, 51));
        anadir.setText("Añadir");
        anadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eliminarValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eliminarValor.setForeground(new java.awt.Color(255, 0, 0));
        eliminarValor.setText("Eliminar");
        eliminarValor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        claveActual.setEditable(false);
        claveActual.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        claveActual.setForeground(new java.awt.Color(47, 2, 2));
        claveActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        claveActual.setText("Reajustable ");
        claveActual.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        palabraActual.setEditable(false);
        palabraActual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        palabraActual.setForeground(new java.awt.Color(30, 1, 1));
        palabraActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        palabraActual.setText("Palabra actual:");
        palabraActual.setBorder(null);

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

        menu.add(archivos);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editorValores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editorClaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(palabraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveActual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(palabraActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(claveActual, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editorClaves, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editorValores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    
                }
                
            }catch(Exception e){
                
                JOptionPane.showConfirmDialog(null, "No se pudo abrir el archivo", 
                   "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                
            }
            
        }
        
    }//GEN-LAST:event_abrirActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        
        f = null;
        m = new Manejador();
        cerrar.setEnabled(false);
        texto.setEnabled(false);

    }//GEN-LAST:event_cerrarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        String sinonimos = m.buscar(editorClaves.getText());
        
        texto.setText(sinonimos);
        
    }//GEN-LAST:event_buscarActionPerformed

    /**
     * @param args the command line arguments
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
    private javax.swing.JButton buscar;
    private javax.swing.JMenuItem cerrar;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField claveActual;
    private javax.swing.JTextField editorClaves;
    private javax.swing.JTextField editorValores;
    private javax.swing.JButton eliminarClave;
    private javax.swing.JButton eliminarValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextField palabraActual;
    private javax.swing.JScrollPane panel;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
