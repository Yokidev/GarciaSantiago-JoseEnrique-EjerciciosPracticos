package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.models.Agente;

/**
 *
 * @author jegs_
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        // Ejercicio Nº 1 - Simulación de un centro de atención al cliente
        
        /**
         * Crea una simulación de un centro de atención al cliente en la que varios agentes de soporte pueden atender llamadas telefónicas concurrentemente.
         * Cada agente se representa como un hilo independiente.
         * Los agentes deben recibir llamadas de clientes, resolver consultas y registrar información sobre cada llamada. Utiliza hilos para simular la atención concurrente de múltiples llamadas y garantizar que los agentes puedan manejarlas de manera eficiente.
         * Asegúrate de controlar la concurrencia para evitar conflictos en la asignación de llamadas a los agentes.
         */
        
        Agente agente1 = new Agente("Jose");
        Agente agente2 = new Agente("Daniel");
        Agente agente3 = new Agente("Cayetano");
        Agente agente4 = new Agente("Javier");
        Agente agente5 = new Agente("Adrian");
        
        agente1.run();
        agente2.run();
        agente3.run();
        agente4.run();
        agente5.run();
        
        
        
    }
}
