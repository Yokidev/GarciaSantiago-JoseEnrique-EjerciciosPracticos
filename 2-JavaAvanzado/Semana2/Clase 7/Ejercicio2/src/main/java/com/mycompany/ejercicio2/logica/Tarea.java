
package com.mycompany.ejercicio2.logica;

import java.util.ArrayList;
import java.util.List;


public class Tarea {
    
    private String tarea;
    private List<Tarea> subTareas;

    public Tarea() {
    }
    
    public Tarea(String nombre) {
        this.tarea = nombre;
        this.subTareas = new ArrayList<>();
    }

    public String getTarea() {
        return tarea;
    }

    public List<Tarea> getSubTareas() {
        return subTareas;
    }

    
    
    
    
}
