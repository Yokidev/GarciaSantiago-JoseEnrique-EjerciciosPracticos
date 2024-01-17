/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1.models;

import com.mycompany.ejercicio1.persistence.PersistenceController;
import java.util.List;

/**
 *
 * @author jegs_
 */
public class Controller {

    PersistenceController persistenceController = new PersistenceController();

    public void crearPartido(String nombre, int votos) {
        persistenceController.createPartido(new Partido(nombre, votos));
    }

    public List<Partido> listPartidos() {
        return persistenceController.listPartido();
    }

    public Partido findPartido(int idPartido) {
        return persistenceController.findPartido(idPartido);
    }

    public void editPartido(int votos, Partido partido) {

        partido.setVotes(votos);

        persistenceController.editPartido(partido);

    }

}
