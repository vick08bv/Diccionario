/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author usr
 */
public class Manejador {
    
    private HashMap <String, ArrayList<String>> dict;
    
    public Manejador(){
        
        dict = new HashMap<>();
        
    }
    
    public void leer(File archivo) throws FileNotFoundException, IOException{
        
        dict = new HashMap<>();
        
        FileReader fReader = new FileReader(archivo);
        BufferedReader bReader = new BufferedReader(fReader);
            
        String linea = bReader.readLine();
            
        while(linea != null){
                
            linea = linea.replace(" ", "");
            String [] entrada = linea.split(";");
            String [] sinonimos = entrada[1].split(",");
            this.dict.put(entrada[0], toLista(sinonimos));
            linea = bReader.readLine();
                
        }
            
        bReader.close();
        fReader.close();

    }
    
    
    public String buscar(String palabra){
        
        if(this.dict.containsKey(palabra)){
        
            ArrayList<String> sinonimos = this.dict.get(palabra);
            String cadena = "";
            
            for(String sinonimo: sinonimos){
            
                cadena += sinonimo + " ";
                
            }
            
            return cadena;
            
        }
        
        return "Ninguno";
    
    }

            
    private ArrayList<String> toLista(String [] sinonimos){
        
        ArrayList<String> lista = new ArrayList<>();
        
        for (String palabra: sinonimos) {
            lista.add(palabra);
        }
        
        return lista;
    }
    
}
