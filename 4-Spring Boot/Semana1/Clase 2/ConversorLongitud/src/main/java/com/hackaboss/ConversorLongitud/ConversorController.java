package com.hackaboss.ConversorLongitud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    @GetMapping("/conversor/{cm}")
    public String conversorCm(@PathVariable double cm){

        double metros = cm / 100;

        return "El equivalente en metros de " + cm + "cm son " + metros + "m.";
    }


}
