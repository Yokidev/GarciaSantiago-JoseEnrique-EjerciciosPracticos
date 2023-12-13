package com.ejercicio2;

public class Main {
    public static void main(String[] args) {

        //Ejercicio Nº 2 - Tipos de Datos - Grupal

        /*
        * Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String.
        * Asigna un valor a cada variable y muestra su contenido en la consola.
        */

        int number = 3;
        System.out.println(number);

        double decimal = 2.5;
        System.out.println(decimal);

        boolean flag = true;
        System.out.println(flag);

        String text = "Hola buenas tardes";
        System.out.println(text);

        /*
        * Ahora, asigna valores que no correspondan al tipo de dato.
        * Por ejemplo, un int en un String o un String en un double…
        */

        number = false;

        decimal = 'a';

        number = 'a';

        char = 70;

        flag = 123;

        text = 500;

        /*
        * ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no?
        * Justificar el por qué de cada caso. Debatir con otros compañeros.
        */

        /**
         * El programa se detiene porque se presenta un error dado que el tipo de dato de la variable 'number' (linea 30) no concuerda con el tipo del dato en sí.
         * Aun si este no saltara, en las lineas 36, 38 y 40 tampoco concuerdan el tipo de la variable con el dato alojado.
         * La única que no da error es cuando se asigna un char a un tipo numérico. Este asigna el valor decimal del char correspondiente en la tabla ASCII.
         */


    }
}
