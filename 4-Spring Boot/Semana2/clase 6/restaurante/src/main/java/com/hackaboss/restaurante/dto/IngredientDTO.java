package com.hackaboss.restaurante.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IngredientDTO {

    private Long id;
    private String name;
    private Integer calories;

}
