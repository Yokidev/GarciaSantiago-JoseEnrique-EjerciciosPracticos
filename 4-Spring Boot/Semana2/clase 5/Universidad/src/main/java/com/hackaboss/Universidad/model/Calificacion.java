package com.hackaboss.Universidad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {

    private int id;
    private int calificacion1;
    private int calificacion2;
    private int calificacion3;
    private double promedio;
    private Alumno alumno;
}
