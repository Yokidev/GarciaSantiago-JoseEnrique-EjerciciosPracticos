package com.mycompany.ejercicio1.logica;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    public Directorio() {
    }

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<Directorio>();
        this.archivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }
    
    public void agregarArchivo(String archivo){
        this.archivos.add(archivo);
    }
    
    public void agregarSubdirectorios(Directorio directorio){
        this.subdirectorios.add(directorio);
    }
    
    
}
