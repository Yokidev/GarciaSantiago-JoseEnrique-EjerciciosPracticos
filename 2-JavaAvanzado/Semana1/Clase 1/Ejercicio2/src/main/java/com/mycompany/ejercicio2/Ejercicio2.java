package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.models.Inventario;
import com.mycompany.ejercicio2.models.Producto;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        // Ejercicio Nº 2 - Manejo de Inventarios en un Comercio - Individual
        
        /**
         * Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista. Los usuarios pueden agregar productos al inventario proporcionando información como el nombre del producto, el precio y la cantidad disponible. Tu tarea es implementar una función que maneje la gestión de inventarios, validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.
         * Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea opersonalizada) o de utilizar los tipos correctos de excepción en cada caso.
         */
        
        Inventario inventario = new Inventario();
        
        try {
            inventario.agregarProducto("Coche", 20000, 10);
            inventario.agregarProducto("Moto", 13000, 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            inventario.agregarProducto("", 20000, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            inventario.agregarProducto("Pc", 0, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            inventario.agregarProducto("Silla", 200, -2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        inventario.mostrarInventario();
        
    }
    
    
    
}
