package com.hackaboss.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingrediente {

    private Long id;
    private String name;
    private Integer calories;

}
