package com.hackaboss.restaurante.service;

import com.hackaboss.restaurante.model.Ingrediente;
import com.hackaboss.restaurante.model.Plato;

import java.util.List;

public interface IPlatoService {

    public Integer caloriasTotales(String plato);
    public List<Ingrediente> listaIngredientes(String plato);
    public Ingrediente ingredienteMasCalorico(String plato);
}
