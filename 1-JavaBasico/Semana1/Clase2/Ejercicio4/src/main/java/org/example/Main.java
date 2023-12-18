package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio Nº 4 - Matrices - Grupal

        /*
        * Imagina que estás trabajando en un sistema de reservas de asientos para un teatro.
        * Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
        - Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
        - Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2").
          El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
        - Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
        - A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
        - Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro.
        * ¿Funciona para todos los casos? Si
        * ¿Encontraste errores que resolver? Si, los asientos que no existan
        * ¿Considera tu programa los asientos ya reservados? Si
        - El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
        * */

        //Variables
        Scanner scanner = new Scanner(System.in);
        String[][] asientos = {
                {"O","O","O","X","X"},
                {"X","X","O","O","O"},
                {"O","O","X","X","X"},
                {"O","X","O","O","O"},
                {"X","X","X","O","O"}

        };
        int fila;
        int asiento;
        boolean flag = true;


        // Impresion de asientos ocupados (X) y vacios (O)

        System.out.println("*** Mapa asientos ***");

        for (int i = 0; i < asientos.length; i++) {
            System.out.print("|");
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j]);
            }
            System.out.println("|");
        }

        do {
            System.out.println("Elija donde quiere sentarse:");

            do { // Preguntamos hasta que el usuario de un asiento valido

                System.out.println("Fila:");
                fila = scanner.nextInt()-1; // Le restamos 1 al numero introducido para que cuadre con el rango del array

                System.out.println("asiento:");
                asiento = scanner.nextInt()-1; //Le restamos 1 al numero introducido para que cuadre con el rango del array

                if (fila > 5 || fila < 0|| asiento > 5 || asiento < 0){
                    System.out.println("El asiento indicado no existe.");
                    System.out.println("Por favor elija otro.");
                }

            }while (fila > 5 || fila < 0|| asiento > 5 || asiento < 0);

            //Comprobamos el asiento
            if (asientos[fila][asiento].equals("X")){
                System.out.println("Lo sentimos ese asiento esta ocupado. Por favor elija otro.");
            } else {
                asientos[fila][asiento]="X";
                System.out.println("Asiento reservado");
            }

            //Impresion de los asientos actualizado
            for (int i = 0; i < asientos.length; i++) {
                System.out.print("|");
                for (int j = 0; j < asientos[i].length; j++) {
                    System.out.print(asientos[i][j]);
                }
                System.out.println("|");
            }

            //Preguntamos si fue la ultima compra para salir del bucle
            System.out.println("Presione (N) si fue su ultima compra.");
            String fin = scanner.next();
            if(fin.equalsIgnoreCase("N")){
                flag = false;
            }

        } while (flag);

        System.out.println("Hasta la proxima!");

    }
}