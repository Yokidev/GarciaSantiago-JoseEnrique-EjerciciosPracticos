/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackaboss.ejerciciointegrador.models;

import com.hackaboss.ejerciciointegrador.persistence.PersistenceController;
import java.util.List;

/**
 *
 * @author jegs_
 */
public class Controller {
    
    PersistenceController persistenceController = new PersistenceController();
    
    //Equipo
    
    public void crearEquipo(Equipo equipo){
        persistenceController.crearEquipo(equipo);
    }
    
    public List<Equipo> listarEquipos(){
        return persistenceController.listarEquipos();
    }
    
    public void borrarEquipo(int id){
        persistenceController.borrarEquipo(id);
    }
    
    //Partido
    
    public void crearPartido(Partido partido){
        persistenceController.crearPartido(partido);
    }
    
    public List<Partido> listarPartidos(){
        return persistenceController.listarPartidos();
    }
    
    public void borrarPartido(int id){
        persistenceController.borrarPartido(id);
    }
    
}
