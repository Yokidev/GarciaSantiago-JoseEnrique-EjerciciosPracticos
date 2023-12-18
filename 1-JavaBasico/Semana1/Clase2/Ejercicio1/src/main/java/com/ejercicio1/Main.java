package com.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicio Nº 1 - Estructuras Condicionales - Individual

        /*
        * Una recital permite únicamente el ingreso de mayores de 18 años.
        * Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
        * El programa debe mostrar (según cada caso) un mensaje informando la situación.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su edad:");
        int age = scanner.nextInt();

        if (age > 17){
            System.out.println("Bienvenido al recital. Tome su asiento y disfrute.");
        }
        if (age < 18 && age > 0){
            System.out.println("Lo siento, al recital solo pueden asistir mayores de edad.");
        }

    }
}