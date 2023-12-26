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
public class Camioneta extends Vehiculo implements Combustion {

    //Atributos
    private int capcidadTanque;
    private int consumoCombustible;
    
    //Constructores
    public Camioneta(int capcidadTanque, int consumoCombustible, int id, String placa, String modelo, int anio, int costo) {    
        super(id, placa, modelo, anio, costo);
        this.capcidadTanque = capcidadTanque;
        this.consumoCombustible = consumoCombustible;
    }
    
    //Getters y Setters
    public int getCapcidadTanque() {
        return capcidadTanque;
    }

    public void setCapcidadTanque(int capcidadTanque) {
        this.capcidadTanque = capcidadTanque;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {    
        this.consumoCombustible = consumoCombustible;
    }

    //Metodos
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
        return "Camioneta " + "capcidadTanque=" + capcidadTanque + ", consumoCombustible=" + consumoCombustible + super.toString();
    }
    
    
    
}
