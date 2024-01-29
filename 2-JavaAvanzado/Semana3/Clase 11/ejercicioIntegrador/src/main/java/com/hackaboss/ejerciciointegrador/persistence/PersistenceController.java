/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackaboss.ejerciciointegrador.persistence;

import com.hackaboss.ejerciciointegrador.models.Equipo;
import com.hackaboss.ejerciciointegrador.models.Partido;
import com.hackaboss.ejerciciointegrador.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jegs_
 */
public class PersistenceController {
    
    EquipoJpaController equipoJpaController = new EquipoJpaController();
    PartidoJpaController partidoJpaController = new PartidoJpaController();
    
    //Equipo
    
    public void crearEquipo(Equipo equipo){
        equipoJpaController.create(equipo);
    }
    
    public List<Equipo> listarEquipos(){
        return equipoJpaController.findEquipoEntities();
    }
    
    public void borrarEquipo(int idEquipo){
        try {
            equipoJpaController.destroy(idEquipo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Partido
    
    public void crearPartido(Partido partido){
        partidoJpaController.create(partido);
    }
    
    public List<Partido> listarPartidos(){
        return partidoJpaController.findPartidoEntities();
    }
    
    public void borrarPartido(int idPartido){
        try {
            partidoJpaController.destroy(idPartido);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
