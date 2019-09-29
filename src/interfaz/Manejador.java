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
        
        dict = new HashMap<>();
        
        FileReader fReader = new FileReader(archivo);
        BufferedReader bReader = new BufferedReader(fReader);
            
        String linea = bReader.readLine();
            
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
        
            ArrayList<String> sinonimos = this.dict.get(palabra);
            String cadena = "";
            
            for(String sinonimo: sinonimos){
            
                cadena += "\n  " + sinonimo + ",";
                
            }
            
            return cadena;
            
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
                
                if(sinonimosTotales.contains(sinonimo)){} else {
                
                sinonimosTotales.add(sinonimo);
                
                }
                    
            }
            
            this.dict.put(clave, sinonimosTotales);
        
        } else {
        
            this.dict.put(clave, this.toLista(sinonimos));
    
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
                
            this.dict.put(clave, sinonimosRestantes);
                
        } 
        
    }
    
    
    /**
     * Escribe el contenido del diccionario en el archivo con la ruta
     * especificada.
     * @param ruta 
     */
    public void guardar(String ruta){
        
        try {
            
            PrintWriter pw = new PrintWriter(new File(ruta));
        
            StringBuilder sb = new StringBuilder();
                
            ArrayList<String> palabras = new ArrayList<>();
                
            ArrayList<String> sinonimos = new ArrayList<>();
            
            for(String palabra: this.dict.keySet()){
                
                palabras.add(palabra);
                
            }
                
            palabras.sort(String::compareTo);
            
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
            
            
        pw.write(sb.toString());
        pw.close();
        
        } catch (Exception e) {
        
        }
    
    }
        
    
    /**
     * Convierte un arreglo de cadenas a una lista de cadenas.
     * @param sinonimos Arreglo.
     * @return Lista.
     */   
    private ArrayList<String> toLista(String[] sinonimos){
        
        ArrayList<String> lista = new ArrayList<>();
        
        for (String palabra: sinonimos) {
            lista.add(palabra);
        }
        
        return lista;
    }
    
}
