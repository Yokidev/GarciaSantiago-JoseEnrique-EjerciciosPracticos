package com.hackaboss.Universidad.sevice;

import com.hackaboss.Universidad.model.Calificacion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CalificacionSV implements ICalificacionService {

    AlumnoSV alumnoSV = new AlumnoSV();

    List<Calificacion> listaCalificaciones = Arrays.asList(
            new Calificacion(1, 80, 75, 90, 81.7, alumnoSV.listaAlumnos.get(0) ),
            new Calificacion(2, 85, 90, 88, 87.7, alumnoSV.listaAlumnos.get(1)),
            new Calificacion(3, 70, 65, 75, 70.0, alumnoSV.listaAlumnos.get(2)),
            new Calificacion(4, 95, 88, 92, 91.7, alumnoSV.listaAlumnos.get(3)),
            new Calificacion(5, 78, 82, 80, 80.0, alumnoSV.listaAlumnos.get(4))
    );

    @Override
    public Calificacion obtenerCalificacionPorMatricula(int numMatricula) {

        return listaCalificaciones.stream()
                .filter(calificacion -> calificacion.getAlumno().getNumMatricula() == numMatricula)
                .findFirst()
                .get();
    }

    @Override
    public List<Calificacion> calificacionesOrdenDesc() {

        listaCalificaciones.sort((C1,C2) -> Double.compare(C2.getPromedio(), C1.getPromedio()));

        return listaCalificaciones;
    }
}
