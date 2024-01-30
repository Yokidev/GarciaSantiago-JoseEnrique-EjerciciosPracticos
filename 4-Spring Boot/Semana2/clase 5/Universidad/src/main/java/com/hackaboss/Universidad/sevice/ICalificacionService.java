package com.hackaboss.Universidad.sevice;

import com.hackaboss.Universidad.model.Calificacion;

import java.util.List;
import java.util.Map;

public interface ICalificacionService {

    public Calificacion obtenerCalificacionPorMatricula(int numMatricula);
    public List<Calificacion> calificacionesOrdenDesc();

}
