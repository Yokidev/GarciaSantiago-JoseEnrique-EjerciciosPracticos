package com.ejercicio3;

public class Main {
    public static void main(String[] args) {

        //Ejercicio Nº 3 - Variables y Operadores - Individual

        /*
        *  Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.
        *  Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).
        */

        // Atributos del triangulo

        int base = 3;
        int altura = 6;

        // Formula

        double area = (double) (base * altura)/2;


        System.out.println("El area del triangulo es: " + area);


    }
}