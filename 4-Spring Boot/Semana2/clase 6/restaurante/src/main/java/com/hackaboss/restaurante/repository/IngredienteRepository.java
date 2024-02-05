package com.hackaboss.restaurante.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackaboss.restaurante.dto.IngredientDTO;
import com.hackaboss.restaurante.model.Ingrediente;
import com.hackaboss.restaurante.model.Plato;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class IngredienteRepository {

    List<Ingrediente> ingredientes = Arrays.asList(
            new Ingrediente(1L, "Harina", 364),
            new Ingrediente(2L, "Azúcar", 387),
            new Ingrediente(3L, "Mantequilla", 717),
            new Ingrediente(4L, "Huevos", 155),
            new Ingrediente(5L, "Leche", 42),
            new Ingrediente(6L, "Aceite de oliva", 884),
            new Ingrediente(7L, "Sal", 0),
            new Ingrediente(8L, "Pimienta", 0),
            new Ingrediente(9L, "Tomate", 18),
            new Ingrediente(10L, "Cebolla", 40),
            new Ingrediente(11L, "Ajo", 149),
            new Ingrediente(12L, "Limón", 29),
            new Ingrediente(13L, "Chocolate", 546),
            new Ingrediente(14L, "Canela", 247),
            new Ingrediente(15L, "Vainilla", 288)
    );

    List<Plato> platos = Arrays.asList(
            new Plato(1L, "Pastel", 20.99, Arrays.asList(ingredientes.get(0),
                    ingredientes.get(1),
                    ingredientes.get(2))),
            new Plato(2L, "Tortilla", 15.50, Arrays.asList(ingredientes.get(3), ingredientes.get(4), ingredientes.get(5))),
            new Plato(3L, "Ensalada", 12.75, Arrays.asList(ingredientes.get(6), ingredientes.get(7), ingredientes.get(8))),
            new Plato(4L, "Sopa", 8.99, Arrays.asList(ingredientes.get(9), ingredientes.get(10), ingredientes.get(11))),
            new Plato(5L, "Postre de chocolate", 18.25, Arrays.asList(ingredientes.get(12), ingredientes.get(13), ingredientes.get(14)))
    );

    public List<Plato> listaPlatos(){
        return platos;
    }


}
