/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2.modelos;

/**
 *
 * @author jegs_
 */
public class Trabajador implements Runnable{

    private String name;
    private Fabrica fabrica;

    public Trabajador(String name, Fabrica fabrica) {
        this.name = name;
        this.fabrica = fabrica;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }
    
    
    @Override
    public void run() {
        
        fabrica.ensamblar();
        fabrica.controlCalidad();
        fabrica.embalar();
        
    }
    
    
    
}
