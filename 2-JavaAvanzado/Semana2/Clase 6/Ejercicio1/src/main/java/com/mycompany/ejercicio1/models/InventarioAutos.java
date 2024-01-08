/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jegs_
 */
public class InventarioAutos {
    
    private List<Auto> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    // Agregar autos al inventario
    public <T extends Auto> void agregarAuto(T auto) {
        inventario.add(auto);
    }

    // Buscar autos por marca
    public <T extends Auto> List<T> buscarPorMarca(String marca, Class<T> type) {
        return inventario.stream()
                .filter(auto -> auto.getMarca().equalsIgnoreCase(marca))
                .map(type::cast)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    // Buscar autos por año
    public <T extends Auto> List<T> buscarPorAño(int año, Class<T> type) {
        return inventario.stream()
                .filter(auto -> auto.getAnio() == año)
                .map(type::cast)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    // Calcular el valor total del inventario
    public double calcularValorTotal() {
        return inventario.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();
    }
    
}
