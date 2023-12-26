/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.models;

import ejercicio1.interfaces.Combustion;

/**
 *
 * @author jegs_
 */
public class Moto extends Vehiculo implements Combustion {
    
    //Atributos
    private int cilindrada;
    private String tipoMotor;

    //Constructor

    public Moto(int cilindrada, String tipoMotor, int id, String placa, String modelo, int anio, int costo) {
        super(id, placa, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }
    
    //Getters y Setters

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    
    @Override
    public int antiguedad() {
        return super.getANIOACTUAL() - super.getAnio();
    }

    
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible.");
    }

    @Override
    public String toString() {
        return "Moto " + "cilindrada=" + cilindrada + ", tipoMotor=" + tipoMotor + super.toString();
    }
    
    
    
    
    
}
