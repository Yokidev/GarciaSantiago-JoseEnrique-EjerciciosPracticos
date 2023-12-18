package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio Nº 3 - Arreglos: Vectores - Individual

        /*
         * Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.
         * Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
         * Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
         * */

        //Variables
        Scanner scanner = new Scanner(System.in);
        int[] temperaturas = new int[7];
        int totalTemperaturas = 0;
        int mediaTemperaturas = 0;

        System.out.println("Introduce las temperaturas máximas de los ultimos 7 días en grados centígrados:");

        //Guardamos los datos en el array
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura día "+ (i+1) +":");
            temperaturas[i] =scanner.nextInt();
        }

        //Calculamos la media de las temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            totalTemperaturas += temperaturas[i];

            if (i==6){
                mediaTemperaturas = totalTemperaturas / 7;
            }
        }

        System.out.println("La temperatura media máxima esta última semana ha sido de  " + mediaTemperaturas + " ºC.");

    }
}