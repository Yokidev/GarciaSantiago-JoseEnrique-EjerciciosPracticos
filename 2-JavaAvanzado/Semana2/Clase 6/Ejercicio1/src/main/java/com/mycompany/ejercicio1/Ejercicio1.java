/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.models.Auto;
import com.mycompany.ejercicio1.models.InventarioAutos;
import java.util.List;

/**
 *
 * @author jegs_
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Ejercicio 1: Concesionaria de Autos
        
        /**
         * Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:
         * Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.
         * Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.
         * Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario.
         */
        
        // Crear instancias de autos
        Auto auto1 = new Auto("Toyota", "Corolla", 2022, 25000);
        Auto auto2 = new Auto("Honda", "Civic", 2021, 23000);
        Auto auto3 = new Auto("Toyota", "Camry", 2022, 30000);

        // Crear el inventario y agregar autos
        InventarioAutos inventario = new InventarioAutos();
        inventario.agregarAuto(auto1);
        inventario.agregarAuto(auto2);
        inventario.agregarAuto(auto3);

        // Buscar autos por marca
        List<Auto> toyotas = inventario.buscarPorMarca("Toyota", Auto.class);
        System.out.println("Autos de la marca Toyota:");
        toyotas.forEach(System.out::println);

        // Buscar autos por año
        List<Auto> autos2022 = inventario.buscarPorAño(2022, Auto.class);
        System.out.println("\nAutos del año 2022:");
        autos2022.forEach(System.out::println);

        // Calcular el valor total del inventario
        double valorTotal = inventario.calcularValorTotal();
        System.out.println("\nValor total del inventario: €" + valorTotal);
    
        
    }
}
