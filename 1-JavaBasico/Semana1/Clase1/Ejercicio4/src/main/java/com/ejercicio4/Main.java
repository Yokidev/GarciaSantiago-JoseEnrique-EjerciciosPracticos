package com.ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ejercicio Nº 4 - Operaciones de Lectura - Grupal

        /*
        * Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división.
        * Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.
        */

        //Inicializamos la clase escaner
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario los datos
        System.out.println("A continuación se le va a pedir que introduzca dos numeros enteros.");
        System.out.println("Introduzca el primer valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Introduzca el segundo valor:");
        int valor2 = scanner.nextInt();

        //Realizamos las operaciones

        //Suma
        int suma = valor1 + valor2;

        //Resta
        int resta = valor1 - valor2;

        //Multiplicacion
        int multiplicacion = valor1 * valor2;

        //Division
        int division = valor1 / valor2;

        //Mostramos por pantalla

        System.out.println("Los resultado de las operaciones han sido las siguientes:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);


        /*
        * Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?
        */

        /**
         * Daria error de ejecución ya que no se puede dividir por cero.
         * La evitaria añadiendo un if de modo que si el divisor es cero, en vez de realizar la operacion de da error, mostraria un mensaje por pantalla al usuario recordandole que no se puede dividir por cero.
         */


    }

}
