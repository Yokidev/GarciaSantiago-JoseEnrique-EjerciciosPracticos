package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.logica.Directorio;
import com.mycompany.ejercicio1.logica.ExploradorDirectorios;


public class Ejercicio1 {

    public static void main(String[] args) {
        
        // Ejercicio 1: Exploración de Directorios
        
        /**
         * Crea un programa que simule la exploración recursiva de directorios en el sistema de archivos de un sistema operativo utilizando una estructura de datos propia.
         * Emplea una estructura donde cada nodo representa un directorio y contiene referencias a sus subdirectorios.
         * El programa debe realizar una exploración simulada para mostrar la jerarquía de directorios y archivos.
         * 
         * Pistas:
         * Puedes utilizar una clase Directorio para cada una de las carpetas/directorios que contenga como datos: id, nombre, listaSubdirectorios, listaArchivos
         * 
         * Puedes utilizar una clase "ExploradorDirectorios" con un método "explorarDirectorio" que sirva para la recursividad.
         */
        
        
        Directorio directorioPrincipal = new Directorio("Principal");
        
        Directorio directorio1 = new Directorio("Directorio 1");
        Directorio directorio2 = new Directorio("Directorio 2");
        Directorio directorio3 = new Directorio("Directorio 3");
        Directorio directorio4 = new Directorio("Subdirectorio 1");
        Directorio directorio5 = new Directorio("Subdirectorio 2");
        Directorio directorio6 = new Directorio("Subsubdirectorio 1");
        Directorio directorio7 = new Directorio("Subsubdirectorio 2");
        
        directorioPrincipal.agregarSubdirectorios(directorio1);
        directorioPrincipal.agregarSubdirectorios(directorio2);
        directorioPrincipal.agregarSubdirectorios(directorio3);
        
        directorio1.agregarSubdirectorios(directorio4);
        
        directorio2.agregarSubdirectorios(directorio5);
        
        directorio5.agregarSubdirectorios(directorio6);
        directorio5.agregarSubdirectorios(directorio7);
        
        directorioPrincipal.agregarArchivo("Arc1.txt");
        directorioPrincipal.agregarArchivo("Arc2.txt");
        directorioPrincipal.agregarArchivo("Arc3.txt");
        directorio1.agregarArchivo("Arc10.txt");
        directorio1.agregarArchivo("Arc11.txt");
        directorio2.agregarArchivo("Arc20.txt");
        directorio3.agregarArchivo("Arc30.txt");
        directorio3.agregarArchivo("Arc31.txt");
        directorio4.agregarArchivo("Arc40.txt");
        directorio5.agregarArchivo("Arc50.txt");
        directorio5.agregarArchivo("Arc51.txt");
        directorio6.agregarArchivo("Arc60.txt");
        directorio6.agregarArchivo("Arc61.txt");
        directorio7.agregarArchivo("Arc70.txt");
        
        ExploradorDirectorios exploradorDirectorios = new ExploradorDirectorios();
        
        exploradorDirectorios.explorarDirectorios(directorioPrincipal, " ");
        
    }
}
