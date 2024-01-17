/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1.persistence;

import com.mycompany.ejercicio1.models.Partido;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jegs_
 */
public class PersistenceController {

    PartidoJpaController persiJpaController = new PartidoJpaController();

    public void createPartido(Partido partido) {
        persiJpaController.create(partido);
    }

    public List<Partido> listPartido() {
        return persiJpaController.findPartidoEntities();
    }

    public Partido findPartido(int idPartido) {
        return persiJpaController.findPartido(idPartido);
    }

    public void editPartido(Partido partido) {
        try {
            persiJpaController.edit(partido);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
