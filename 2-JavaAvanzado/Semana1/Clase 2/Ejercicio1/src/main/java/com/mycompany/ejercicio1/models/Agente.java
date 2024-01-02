package com.mycompany.ejercicio1.models;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agente extends Thread{
    
    private String name;

    public Agente(String name) {
        this.name = name;
    }

    private int duracionLlamadaMin(){
        // Crear un objeto de la clase Random
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 2 para representar la duración en minutos
        int duracionLlamada = random.nextInt(2) + 1;

        return duracionLlamada;
    }
    
    @Override
    public void run() {
        
        try {
            System.out.println("Agente "+ name +" recibiendo llamada");
                Thread.sleep(duracionLlamadaMin()*1000);

            System.out.println("Agente "+ name +" resolviendo consulta");
            Thread.sleep(duracionLlamadaMin()*1000);

            System.out.println("Agente "+ name +" registrando informacion");
            Thread.sleep(duracionLlamadaMin()*1000);

            System.out.println("Llamada finalizada de agente "+ name);
        } catch (InterruptedException ex) {
            Logger.getLogger(Agente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
}
