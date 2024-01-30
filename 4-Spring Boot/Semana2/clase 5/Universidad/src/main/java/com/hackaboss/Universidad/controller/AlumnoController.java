package com.hackaboss.Universidad.controller;

import com.hackaboss.Universidad.model.Alumno;
import com.hackaboss.Universidad.model.Calificacion;
import com.hackaboss.Universidad.sevice.AlumnoSV;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    AlumnoSV alumnoSV = new AlumnoSV();


    @GetMapping()
    public List<Alumno> obtenerAlumnos(){

        return alumnoSV.obtenerAlumnos();
    }


}
