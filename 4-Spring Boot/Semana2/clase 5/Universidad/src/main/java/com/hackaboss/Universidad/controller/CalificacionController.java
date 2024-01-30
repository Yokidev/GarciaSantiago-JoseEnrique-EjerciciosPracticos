package com.hackaboss.Universidad.controller;

import com.hackaboss.Universidad.model.Calificacion;
import com.hackaboss.Universidad.sevice.CalificacionSV;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calificacion")
public class CalificacionController {

    CalificacionSV calificacionSV = new CalificacionSV();

    @GetMapping()
    public Calificacion obtenerCalificacionPorMatricula(@RequestParam int matricula){

        return calificacionSV.obtenerCalificacionPorMatricula(matricula);
    }

    @GetMapping("/orden")
    public List<Calificacion> calificacionPorOrden(){

        return calificacionSV.calificacionesOrdenDesc();
    }


}
