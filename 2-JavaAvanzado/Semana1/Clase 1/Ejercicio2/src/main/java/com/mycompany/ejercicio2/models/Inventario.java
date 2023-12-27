/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2.models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jegs_
 */
public class Inventario {
    
    Map<String,Producto> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }
    
    public void agregarProducto(String nombre, int precio, int cantidad) {
        
        if (nombre==null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Debe contener un nombre valido");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0");
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad de productos debe ser un valor positivo");
        }
        
        Producto producto = new Producto(nombre, precio, cantidad);
        
        this.inventario.put(nombre, producto);
    }
    
    public void mostrarInventario(){
        System.out.println("--- Objetos en el inventario ---");
        for(Producto producto:inventario.values()){
            System.out.println(producto);
        }
    }
    
}
