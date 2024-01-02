/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.modelos.Fabrica;
import com.mycompany.ejercicio2.modelos.Trabajador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jegs_
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        // Ejercicio Nº 2 - Simulación de cadena de producción
        
        /**
        • Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar tareas concurrentemente.
        • Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar tareas concurrentemente.
        • Cada trabajador se representa como un hilo independiente.
        • Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.
        • Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.
        • Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación entre las tareas.
        */

        Fabrica fabrica = new Fabrica();
        
        Thread trabajador1 = new Thread(new Trabajador("Jose", fabrica),"Jose");
        Thread trabajador2 = new Thread(new Trabajador("Javi", fabrica),"Javi");
        Thread trabajador3 = new Thread(new Trabajador("Caye", fabrica),"Caye");
        

        trabajador1.start();
        trabajador2.start();
        trabajador3.start();
                
        try {
            trabajador1.join();
            trabajador2.join();
            trabajador3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
