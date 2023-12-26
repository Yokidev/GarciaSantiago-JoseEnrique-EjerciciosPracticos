/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.models;

import ejercicio1.interfaces.Electrico;

/**
 *
 * @author jegs_
 */
public class Auto extends Vehiculo implements Electrico{

    //Atribbutos
    private int capacidadBateria; //mAh
    private int autonomia; //hs
    
    //Constructores

    public Auto(int capacidadBateria, int autonomia, int id, String placa, String modelo, int anio, int costo) {
        super(id, placa, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }
    
    //Getters and Setters 

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    
    
    //Metodos
    @Override
    public int antiguedad() {
        
        return super.getANIOACTUAL() - super.getAnio();
    }

    @Override
    public void cargarEnergia() {
    
        System.out.println("Cargando energia.");
    }

    @Override
    public String toString() {
        
        return "Auto " + "capacidadBateria=" + capacidadBateria + ", autonomia=" + autonomia + super.toString();
    }
    
    
    
    
}
