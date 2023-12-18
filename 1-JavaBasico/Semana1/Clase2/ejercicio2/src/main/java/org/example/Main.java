package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio Nº 2 - Estructuras Repetitivas - Individual

        /*
         * Imagina que eres un cajero en un supermercado.
         * Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
         * Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar.
         * Luego, muestra el total de la compra que debe abonar.
         * */

        //Variable total de la compra y la bandera para el bucle
        double total = 0;
        boolean flag = true;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los precios de los productos:");

        do {
            double precioProducto = scanner.nextDouble();

            total += precioProducto;

            System.out.println("¿Hay más productos?(Y/N)");
            String masProductos = scanner.next();

            if (masProductos.equalsIgnoreCase("n")){
                flag = false;
            } else {
                System.out.println("Siguiente producto:");
            }

        }while (flag);

        //Imprimimos el total
        System.out.println("El precio total es " + total +"€");

    }
}