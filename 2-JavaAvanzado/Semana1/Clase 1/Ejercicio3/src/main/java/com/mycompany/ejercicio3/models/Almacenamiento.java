package com.mycompany.ejercicio3.models;

import java.util.ArrayList;
import java.util.Vector;

public class Almacenamiento {
    
    private final int CAPACIDAD = 5;
    private ArrayList<String> almacenamiento;

    public Almacenamiento() {
        this.almacenamiento = new ArrayList<String>(CAPACIDAD);
    }
    
    public void almacenarDato(String dato){
        if (almacenamiento.size() > CAPACIDAD-1) {
            System.out.println("Alamacenamiento lleno");
        }else{
            almacenamiento.add(dato);
            System.out.println("Dato almacenado");
        }               
    }
    
    public void accederDatos(int indice){
        try{
            String dato = almacenamiento.get(indice);
            System.out.println("Dato del indice "+indice+ " " + dato);
        }catch(IndexOutOfBoundsException e){
            System.out.println("El indice introducido no existe. La posicion no es valida");
        }
    }
    
}
