/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2.modelos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jegs_
 */
public class Fabrica {

    
    public Fabrica() {
    }
    
    
    public synchronized void ensamblar(){
        
        try {
            System.out.println("El trabajador "+ Thread.currentThread().getName() + " ensambla el producto.");
            Thread.sleep(8000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Fabrica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public synchronized void controlCalidad(){
        
        try {
            System.out.println("El trabajador "+ Thread.currentThread().getName() + " prueba e inspecciona el producto.");
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Fabrica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public synchronized void embalar(){
        
        try {
            System.out.println("El trabajador "+ Thread.currentThread().getName() + " embala el producto.");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Fabrica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
