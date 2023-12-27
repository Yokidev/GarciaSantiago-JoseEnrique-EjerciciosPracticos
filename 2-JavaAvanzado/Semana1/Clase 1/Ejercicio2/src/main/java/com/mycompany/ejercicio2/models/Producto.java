package com.mycompany.ejercicio2.models;


public class Producto {
 
    //Atributos
    private String nombre;
    private int precio;
    private int cantidad;
    
    //Constructores
    public Producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Metodos

    @Override
    public String toString() {
        return "Nombre " + nombre + ", precio " + precio + ", cantidad " + cantidad;
    }
    
    
}
