package com.hackaboss.refranes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class RefranesController {

    List<String> refranes = Arrays.asList(
            "A quien madruga, Dios le ayuda.",
            "Más vale tarde que nunca.",
            "No hay mal que por bien no venga.",
            "El que mucho abarca, poco aprieta.",
            "En boca cerrada no entran moscas.",
            "Más vale prevenir que lamentar.",
            "Más vale pájaro en mano que ciento volando.",
            "Camarón que se duerme, se lo lleva la corriente.",
            "No por mucho madrugar amanece más temprano.",
            "El que siembra vientos, recoge tempestades.",
            "A caballo regalado, no se le miran los dientes.",
            "Dime con quién andas y te diré quién eres.",
            "Quien mucho abarca, poco aprieta.",
            "A falta de pan, buenas son tortas.",
            "El amor todo lo puede."
    );

    @GetMapping()
    public String obtenerRefran(){

        Integer numRandom = new Random().nextInt(refranes.size());

        return refranes.get(numRandom);
    }

}
