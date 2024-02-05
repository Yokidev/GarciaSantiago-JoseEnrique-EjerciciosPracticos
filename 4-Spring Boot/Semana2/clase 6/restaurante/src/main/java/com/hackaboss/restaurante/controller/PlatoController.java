package com.hackaboss.restaurante.controller;

import com.hackaboss.restaurante.model.Ingrediente;
import com.hackaboss.restaurante.service.PlatoSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("platos")
public class PlatoController {

    @Autowired
    private PlatoSV platoSV;

    @GetMapping("totalCalorias")
    public Integer totalCalorias(@RequestParam String plato){
        return platoSV.caloriasTotales(plato);
    }

    @GetMapping("listaIngredientes")
    public List<Ingrediente> listaIngredientes(@RequestParam String plato){
        return platoSV.listaIngredientes(plato);
    }

    @GetMapping("ingredienteMasCalorico")
    public Ingrediente ingredienteMasCalorico(@RequestParam String plato){
        return platoSV.ingredienteMasCalorico(plato);
    }



}
