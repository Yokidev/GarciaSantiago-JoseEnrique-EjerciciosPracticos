package com.hackaboss.refranes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* Ejercicio Nº 1: Generador de refranes
* Crear un programa que, al acceder a localhost:8080 a través de un navegador mediante el métoido GET, devuelva un refrán aleatorio de una lista predefinida.
* Por ejemplo: “No hay mal que por bien no venga”, “Al que madruga Dios lo ayuda”, etc.
* */

@SpringBootApplication
public class RefranesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefranesApplication.class, args);
	}

}
