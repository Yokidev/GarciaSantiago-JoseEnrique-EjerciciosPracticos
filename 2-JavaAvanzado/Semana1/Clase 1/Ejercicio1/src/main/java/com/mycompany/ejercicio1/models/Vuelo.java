package com.mycompany.ejercicio1.models;

import com.mycompany.ejercicio1.excepciones.ReservaInvalidaException;


public class Vuelo {
    
    private String destino;
    private int numAsientos;
    private int numAsientosDisponibles;

    public Vuelo(String destino, int numAsientos, int numAsientosDisponibles) {
        this.destino = destino;
        this.numAsientos = numAsientos;
        this.numAsientosDisponibles = numAsientosDisponibles;
    }
    
    public void reservarVuelo(String nombre, String destino, String fecha, int asientosDeseados) throws ReservaInvalidaException{
        
        if (nombre==null || nombre.isEmpty() || destino == null || destino.isEmpty() || fecha == null || fecha.isEmpty()|| asientosDeseados <=0) {
            throw new ReservaInvalidaException("Rellene todo los campos para poder realizar la reserva");
        }
        
        if(destino != this.destino){
            throw new ReservaInvalidaException("Los destinos no coinciden");
        }
        
        if (asientosDeseados > this.numAsientosDisponibles){
            throw new ReservaInvalidaException("No hay asientos libres suficientes para realizar la reserva.");
        }
        
        System.out.println("Reserva de "+ asientosDeseados +" asientos realizada para el dia "+ fecha + " con destino " + destino + " a nombre de " + nombre);
        
    }
    
}
