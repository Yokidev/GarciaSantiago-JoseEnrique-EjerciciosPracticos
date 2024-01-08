/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.models.Evento;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author jegs_
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Ejercicio Nº 2 - Gestor de Eventos - Individual
        
        /**
         * Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones utilizando Streams y Optionals:
         a) Filtra los eventos que están programados para una fecha específica.
         b) Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.        
         c) Encuentra el evento más próximo en el tiempo utilizando Optionals. 
         */
        
        List<Evento> eventos = Arrays.asList(
                new Evento("Congreso Hematologia", LocalDate.of(2024, Month.MARCH, 2), "Conferencia"),
                new Evento("Reunion mañana", LocalDate.of(2024, Month.FEBRUARY, 12), "Reunion"),
                new Evento("Congreso Dermatologia", LocalDate.of(2024, Month.MARCH,2), "Conferencia"),
                new Evento("Reunion final", LocalDate.of(2024, Month.FEBRUARY, 22), "Reunion"),
                new Evento("Montaje", LocalDate.of(2024, Month.APRIL, 13), "Taller"),
                new Evento("Arreglo coche", LocalDate.of(2024, Month.MARCH, 2), "Taller"));
        
        //a)
        List<Evento> eventoFechaFiltro = eventos.stream()
                .filter(evento -> evento.getFecha().equals(LocalDate.of(2024, Month.MARCH, 2)))
                .collect(Collectors.toList());
        
        eventoFechaFiltro.forEach(System.out::println);
        
        //b)
        Long numEventosConferencia = eventos.stream()
                .filter(evento -> evento.getCategoria().equalsIgnoreCase("Conferencia"))
                .count();
        Long numEventosTaller = eventos.stream()
                .filter(evento -> evento.getCategoria().equalsIgnoreCase("Taller"))
                .count();
        Long numEventosReunion = eventos.stream()
                .filter(evento -> evento.getCategoria().equalsIgnoreCase("Reunion"))
                .count();
        
        System.out.println("Numero eventos Conferencia " + numEventosConferencia);
        System.out.println("Numero eventos Taller " + numEventosTaller);
        System.out.println("Numero eventos Reunion " + numEventosReunion);
        
        //c)
        
        LocalDate ahora = LocalDate.now();
        Optional<Evento> eventoMasProximo = eventos.stream()
                .filter(e -> e.getFecha().isAfter(ahora))
                .min((e1, e2) -> Long.compare(
                        ChronoUnit.DAYS.between(ahora, e1.getFecha()),
                        ChronoUnit.DAYS.between(ahora, e2.getFecha())
                ));
        
        eventoMasProximo.ifPresent(e ->
                System.out.println("Próximo evento: " + e.getNombre() + " - " + e.getFecha()));
        
    }
}
