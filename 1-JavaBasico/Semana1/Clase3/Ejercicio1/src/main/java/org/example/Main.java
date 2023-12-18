package org.example;

public class Main {
    public static void main(String[] args) {

        //Ejercicio Nº 1 - Clases y Objetos - Individual

        /*
        * Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
        * Luego, realiza las siguientes acciones:
        a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
        * */

        //a)
        Electrodomestico electrodomestico1 = new Electrodomestico(3658,"Lg","PleRC154",900,"Rojo");
        Electrodomestico electrodomestico2 = new Electrodomestico(6758,"Sony","RC5400",1500,"Negro");
        Electrodomestico electrodomestico3 = new Electrodomestico(3963,"Philips","M879",2000,"Blanco");

        //b)
        Electrodomestico electrodomestico4 = new Electrodomestico();

        //c)
        System.out.println("Marca " +electrodomestico1.marca+ " modelo " +electrodomestico1.modelo+ " consumo " + electrodomestico1.consumo);
        System.out.println("Marca " +electrodomestico2.marca+ " modelo " +electrodomestico2.modelo+ " consumo " + electrodomestico2.consumo);
        System.out.println("Marca " +electrodomestico3.marca+ " modelo " +electrodomestico3.modelo+ " consumo " + electrodomestico3.consumo);

        //d) Se obtiene un null.
        System.out.println(electrodomestico4.marca);


    }
}