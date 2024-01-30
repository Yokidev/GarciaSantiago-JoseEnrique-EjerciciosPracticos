package com.hackaboss.Universidad.sevice;

import com.hackaboss.Universidad.model.Alumno;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AlumnoSV implements IAlumnoService{

    List<Alumno> listaAlumnos = Arrays.asList(
            new Alumno(1, "Juan", "García", "15/03/2001"),
            new Alumno(2, "María", "López", "20/07/2000"),
            new Alumno(3, "Pedro", "Martínez", "10/01/2002"),
            new Alumno(4, "Ana", "Sánchez", "05/05/2001"),
            new Alumno(5, "Luis", "Hernández", "18/09/2000")
    );

    @Override
    public List<Alumno> obtenerAlumnos() {
        return listaAlumnos;
    }
}
