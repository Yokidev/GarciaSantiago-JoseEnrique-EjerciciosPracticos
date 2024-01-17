
package com.mycompany.ejercicio1.logica;

import java.util.ArrayList;
import java.util.List;


public class ExploradorDirectorios {
    
    private List<Directorio> visitados = new ArrayList<>();
    
    public void explorarDirectorios(Directorio directorio, String espacio){
        
        if(visitados.contains(directorio)){
            return;
        }
        
        visitados.add(directorio);
        
        System.out.println(espacio + directorio.getNombre()+ ":");
        
        for(String archivo: directorio.getArchivos()){
            System.out.println( espacio + "  --> "+ archivo);
        }
        
        for(Directorio subDirectorio: directorio.getSubdirectorios()){
            explorarDirectorios(subDirectorio, espacio + " ");
        }
        
    }
    
}
