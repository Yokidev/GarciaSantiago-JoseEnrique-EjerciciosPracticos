package com.hackaboss.Universidad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    private int numMatricula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
}
