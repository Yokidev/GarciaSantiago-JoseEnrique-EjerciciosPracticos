/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.models;

/**
 *
 * @author jegs_
 */
public abstract class Vehiculo {
    
    //Atributos
    private final int ANIOACTUAL = 2023;
    private int id;
    private String placa;
    private String modelo;
    private int anio;
    private int costo;
    
    

    //Constructores

    public Vehiculo(int id, String placa, String modelo, int anio, int costo) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    
    //Getter y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getANIOACTUAL() {
        return ANIOACTUAL;
    }
    
    
    //Metodos
    public abstract int antiguedad();

    @Override
    public String toString() {
        return  ", id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", anio=" + anio + ", costo=" + costo;
    }
    
    
}
