package interfaz;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.PrintWriter;


/**
 * @author vick08bv
 * Manejador de diccionarios en formato csv.
 */
public class Manejador {
    
    private HashMap <String, ArrayList<String>> dict;
    
    public Manejador(){
        
        dict = new HashMap<>();
        
    }
    
    
    /**
     * Lee un archivo para vertir su contenido en un diccionario.
     * @param archivo Archivo csv.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void leer(File archivo) throws FileNotFoundException, IOException{
        
        //Se crea el diccionario con el cual se
        //administrarán todos los cambios de la
        //sesión, hechos por el usuario.
        
        dict = new HashMap<>();
        
        //Lectores de líneas.
        
        FileReader fReader = new FileReader(archivo);
        BufferedReader bReader = new BufferedReader(fReader);
            
        String linea = bReader.readLine();
        
        //Lectura de cada palabra clave y sus sinónimos, para
        //añadirlas al diccionario.
            
        while(linea != null){
            
            if(linea.isEmpty()){} else {
                
                linea = linea.replace(" ", "");
                String[] entrada = linea.split(";");
                String[] sinonimos = entrada[1].split(",");
                this.dict.put(entrada[0], toLista(sinonimos));
                linea = bReader.readLine();
            
            }
                
        }
            
        bReader.close();
        fReader.close();

    }
    
    
    /**
     * Busca una palabra en el diccionario y devuelve sus sinónimos.
     * @param palabra Palabra que se busca.
     * @return Sinónimos de la palabra.
     */
    public String buscar(String palabra){
        
        if(this.dict.containsKey(palabra)){
            
            if(this.dict.get(palabra).isEmpty()){} else {
        
                ArrayList<String> sinonimos = this.dict.get(palabra);
                String cadena = "";
            
                cadena += "\n  " + sinonimos.get(0);
            
                for(int i = 1; i<sinonimos.size();i++){
            
                    cadena += ",\n  " + sinonimos.get(i);
                
                }
            
                return cadena;
                
            }
            
        }
        
        return "Ninguno.\nLa palabra no se\nencuentra en el\ndiccionario";
    
    }

    
    /**
     * Elimina la palabra actual, del diccionario.
     * @param palabra Palabra a borrar.
     */
    public void borrarClave(String palabra){
        
        if(this.dict.containsKey(palabra)){
            
            this.dict.remove(palabra);
            
        }
    
    }
    
    
    /**
     * Añade al diccionario sinónimos de una palabra dada.
     * @param clave Clave.
     * @param sinonimos Sinónimos que se asociarán a la clave.
     */
    public void anadirValores(String clave, String[] sinonimos){
            
        //Si la clave ya se encuentra en el diccionario, se añaden
        //más sinónimos. Si no se encuentra, se crea y se le agregan
        //los sinónimos indicados.
        
        if(this.dict.containsKey(clave)){
            
            ArrayList<String> sinonimosTotales = new ArrayList<>();
            ArrayList<String> Lsinonimos = this.toLista(sinonimos);
            
            for(String sinonimo: this.dict.get(clave)){
                
                sinonimosTotales.add(sinonimo);
                    
            }
            
            //Se agregan los sinónimos que aún no estén en el diccionario.
            
            for(String sinonimo: Lsinonimos){
                
                if(sinonimosTotales.contains(sinonimo) || 
                   sinonimo.equals("")){} else {
                
                sinonimosTotales.add(sinonimo);
                
                }
                    
            }
            
            if(sinonimosTotales.isEmpty()){} else {
            
                this.dict.put(clave, sinonimosTotales);
            
            }
        
        } else {
            
            if(sinonimos.length == 0){} else {
        
                this.dict.put(clave, this.toLista(sinonimos));
    
            }
            
        }
        
    }
    
    
    /**
     * Añade al diccionario sinónimos de una palabra dada.
     * @param clave Clave.
     * @param sinonimos Sinónimos que se asociarán a la clave.
     */
    public void borrarValores(String clave, String[] sinonimos){
        
        if(this.dict.containsKey(clave)){
                
            ArrayList<String> sinonimosRestantes = new ArrayList<>();
            ArrayList<String> Lsinonimos = this.toLista(sinonimos);
            
            //Quita los sinónimos indicados de
            //la lista asociada a la clave.
            
            for(String sinonimo: this.dict.get(clave)){
                    
                if(Lsinonimos.contains(sinonimo)){} else {
                
                sinonimosRestantes.add(sinonimo);
                    
                }
                
            }
            
            //Si la lista resultante se queda vacía, la clave 
            //se elimina del diccionario, de otra forma, se 
            //actualizan sus sinónimos.
                
            if(sinonimosRestantes.isEmpty()){
                
                this.dict.remove(clave);
            
            } else {
                
                this.dict.put(clave, sinonimosRestantes);
                
            }
        } 
        
    }
    
    
    /**
     * Escribe el contenido del diccionario 
     * en el archivo con la ruta especificada.
     * @param ruta Lugar donde se guardará el archivo.
     */
    public void guardar(String ruta){
        
        try {
            
            //Se inicia el escritor de lineas y una cadena
            //que contendrá toda la información a guardar.
            
            PrintWriter pw = new PrintWriter(new File(ruta));        
            StringBuilder sb = new StringBuilder();
                
            ArrayList<String> palabras = new ArrayList<>();               
            ArrayList<String> sinonimos = new ArrayList<>();
            
            //Primero se ordenan las palabras clave alfabéticamente.
            
            for(String palabra: this.dict.keySet()){
                
                palabras.add(palabra);
                
            }
                
            palabras.sort(String::compareTo);
            
            //Posteriormente, se añade cada clave y sus sinónimos 
            //siguiendo el formato ya establecido.
            
            for(String palabra: palabras){
                
                sinonimos = this.dict.get(palabra);
                
                if(sinonimos.isEmpty()){} else {
                    
                    sb.append(palabra + ";");                   
                    sb.append(" " + sinonimos.get(0));
                    
                    for(int i = 1; i<sinonimos.size(); i++){
                    
                       sb.append(", " + sinonimos.get(i)); 
                    
                    }
                    
                sb.append("\n");
                    
                }
                    
            }
            
        //Finalmente, se escribe totalmente el archivo.
        
        pw.write(sb.toString());
        pw.close();
        
        } catch (Exception e) {
            
            System.out.println("Error al guardar el archivo.");
        
        }
    
    }
        
    
    /**
     * Convierte un arreglo de cadenas a una lista de cadenas.
     * @param sinonimos Arreglo.
     * @return Lista.
     */   
    private ArrayList<String> toLista(String[] sinonimos){
        
        ArrayList<String> lista = new ArrayList<>();
        
        for(String palabra: sinonimos) {
            lista.add(palabra);
        }
        
        return lista;
    }
    
}
