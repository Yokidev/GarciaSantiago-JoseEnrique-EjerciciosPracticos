package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.models.Empleado;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        // Ejercicio Nº 1 - Empleados - Individual
        
        /**
         * Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals:
         a) Filtra los empleados cuyo salario sea mayor a cierto valor específico.
         b) Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
         c) Encuentra al empleado con el salario más alto utilizando Optionals.
         */
        
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Jose", 1800, "Desarrollador"),
                new Empleado("Juan", 1500, "Desarrollador"),
                new Empleado("Alberto", 2000, "Desarrollador"),
                new Empleado("Sara", 2200, "Gerente"),
                new Empleado("Luis", 1900, "Gerente"),
                new Empleado("Daniel", 1700, "Analista"),
                new Empleado("Sandra", 2200, "Analista"));
        
        //a)
        List<Empleado> empleadosFlitroSalario = empleados.stream()
                .filter(empleado -> empleado.getSalario()>1800)
                .collect(Collectors.toList());
        
        empleadosFlitroSalario.forEach(System.out::println);
        
        //b)
        double salarioMedioDesarrollador = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equalsIgnoreCase("Desarrollador"))
                .collect(Collectors.averagingDouble(empleado -> empleado.getSalario()));
        
        double salarioMedioGerente = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equalsIgnoreCase("Gerente"))
                .collect(Collectors.averagingDouble(empleado -> empleado.getSalario()));
        
        double salarioMedioAnalista = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equalsIgnoreCase("Analista"))
                .collect(Collectors.averagingDouble(empleado -> empleado.getSalario()));
        
        System.out.println("Salario medio");
        
        System.out.println("Desarrollador "+salarioMedioDesarrollador);
        System.out.println("Gerente "+salarioMedioGerente);
        System.out.println("Analista "+salarioMedioAnalista);
        
        //c)
        
        Empleado empleadoSalarioMaximo = empleados.stream()
                .max((empleado1, empleado2)-> Double.compare(empleado1.getSalario(), empleado2.getSalario()))
                .orElse(new Empleado());
        
        System.out.println("Empleado con salario mas alto es " + empleadoSalarioMaximo.getNombre());
        
    }
}
