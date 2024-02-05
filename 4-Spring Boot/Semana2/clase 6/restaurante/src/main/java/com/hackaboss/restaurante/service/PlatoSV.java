package com.hackaboss.restaurante.service;

import com.hackaboss.restaurante.model.Ingrediente;
import com.hackaboss.restaurante.model.Plato;
import com.hackaboss.restaurante.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlatoSV implements IPlatoService {

    @Autowired
    private IngredienteRepository ingredienteRepository;


    @Override
    public Integer caloriasTotales(String platoNombre) {

        Integer totalCalorias = 0;

        for (Plato plato: ingredienteRepository.listaPlatos()){
            if(plato.getNombre().equals(platoNombre)){
                for (Ingrediente ingrediente: plato.getIngredientes()){
                    totalCalorias += ingrediente.getCalories();
                }
            }
            break;
        }

        return totalCalorias;
    }

    @Override
    public List<Ingrediente> listaIngredientes(String platoNombre) {
        return ingredienteRepository.listaPlatos().stream()
                .filter(plato -> plato.getNombre().equals(platoNombre))
                .flatMap(plato -> plato.getIngredientes().stream())
                .collect(Collectors.toList());
    }
    @Override
    public Ingrediente ingredienteMasCalorico (String platoNombre){
        Ingrediente ingrediente = ingredienteRepository.listaPlatos().stream()
                .filter(plato -> plato.getNombre().equals(platoNombre))
                .flatMap(plato -> plato.getIngredientes().stream())
                .max(Comparator.comparingInt(Ingrediente::getCalories))
                .get();

        return ingrediente;
    }
}
