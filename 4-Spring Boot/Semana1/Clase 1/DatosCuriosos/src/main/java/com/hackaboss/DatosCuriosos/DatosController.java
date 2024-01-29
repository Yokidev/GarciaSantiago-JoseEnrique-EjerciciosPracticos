package com.hackaboss.DatosCuriosos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class DatosController {

    List<String> datosCuriosos = Arrays.asList(
            "Los pulpos tienen tres corazones.",
            "Los elefantes son los únicos mamíferos que no pueden saltar.",
            "Los koalas tienen huellas dactilares similares a las humanas.",
            "El plátano es una fruta y una hierba.",
            "El corazón humano produce suficiente presión para hacer brotar sangre a una altura de 10 metros.",
            "Las jirafas tienen la misma cantidad de vértebras en el cuello que los humanos.",
            "Los tigres tienen rayas en su piel, no solo en su pelaje.",
            "Las ballenas jorobadas cantan canciones que pueden durar hasta 20 minutos.",
            "El ojo de un avestruz es más grande que su cerebro.",
            "La miel nunca se echa a perder.",
            "Los pingüinos pueden saltar tan alto como 6 pies en el aire.",
            "Los flamencos pueden doblar sus cuellos en forma de S.",
            "La hormiga más grande registrada tenía más de 2 pulgadas de largo.",
            "El kiwi es una de las frutas con mayor contenido de vitamina C.",
            "El agujero en la capa de la capa de ozono es más grande que la superficie de los Estados Unidos."
    );

    @GetMapping()
    public String obtenerDatos(){

        Integer numAleatorio = new Random().nextInt(datosCuriosos.size());

        return datosCuriosos.get(numAleatorio);
    }

}
