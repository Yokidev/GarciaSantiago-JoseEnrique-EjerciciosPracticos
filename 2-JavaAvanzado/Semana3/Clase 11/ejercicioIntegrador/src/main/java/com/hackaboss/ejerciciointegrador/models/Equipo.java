/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackaboss.ejerciciointegrador.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author jegs_
 */
@Entity
public class Equipo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    
    private List<String> listaJugadores;
    
    @OneToMany
    private List<Partido> listaPartidos;

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
        this.listaPartidos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<String> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public List<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }
    
    public void añadirJugador(String jugador){
        listaJugadores.add(nombre);
    }
    
    public void añadirPartido(Partido partido){
        listaPartidos.add(partido);
    }    
    
}
