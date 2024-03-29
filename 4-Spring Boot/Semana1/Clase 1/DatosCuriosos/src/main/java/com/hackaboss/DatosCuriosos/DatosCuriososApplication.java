package com.hackaboss.DatosCuriosos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* Ejercicio Nº 2: Generador de datos curiosos

Crear un programa que, al acceder a localhost:8080 a través de un navegador mediante el métoido GET, devuelva un dato curioso de forma aleatoria de una lista que esté predefinida.
* Por ejemplo: “Los delfines tienen la capacidad de reconocer y recordar estos silbidos específicos incluso después de mucho tiempo”, “Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso”, etc.
* */

@SpringBootApplication
public class DatosCuriososApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatosCuriososApplication.class, args);
	}

}
