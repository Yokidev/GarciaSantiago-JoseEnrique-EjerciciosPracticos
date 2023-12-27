package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.excepciones.ReservaInvalidaException;
import com.mycompany.ejercicio1.models.Vuelo;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio1 {

    public static void main(String[] args) {
        
        // Ejercicio Nº 1 - Reserva de Vuelos - Individual
        
        /**
         * Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea. Los usuarios pueden realizar reservas de vuelos proporcionando información como su nombre,                  destino, fecha de viaje y número de asientos deseados. Tu tarea es implementar una función de reserva de vuelos que valide los datos ingresados y maneje excepciones si los datos son            incorrectos o si no hay suficientes asientos disponibles en el vuelo.

           Debes crear una excepción personalizada, por ejemplo, ReservaInvalidaException, que se lance en situaciones excepcionales, como cuando un usuario intenta reservar más asientos de               los disponibles o si falta información esencial. La excepción personalizada debe proporcionar un mensaje claro sobre la causa del error.
         */
        
        Vuelo vuelo1 = new Vuelo("Japon", 60, 20);
        Vuelo vuelo2 = new Vuelo("Francia", 40, 15);
        Vuelo vuelo3 = new Vuelo("Portugal", 50, 0);
        
      
        try {
            vuelo1.reservarVuelo("Jose", "Japon", "", 4);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            vuelo2.reservarVuelo("Maria", "Paris", "22-07-2024", 4);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            vuelo3.reservarVuelo("Javi", "Portugal", "28-12-2023", 2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
