package com.hackaboss.GestionEventosAcademicos.controller;

import com.hackaboss.GestionEventosAcademicos.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventoController {

    List<Evento> eventoList = new ArrayList<>();


    @PostMapping("/evento")
    public String crearEvento(@RequestBody Evento evento){
        eventoList.add(evento);
        return "Evento agregado";
    }


    @GetMapping("/eventos")
    public List<Evento> obtenerEventos(){
        return eventoList;
    }

    @GetMapping("/evento/{id}")
    public Evento obtenerEventoPorId(@PathVariable int id){

        return eventoList.stream()
                .filter(evento -> evento.getId() == id)
                .findFirst()
                .get();
    }

}
