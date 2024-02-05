package com.hackaboss.VentaAutos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Automovil {

    private Long id;
    private String brand;
    private String model;
    private String kilometers;
    private Integer doors;
    private Double price;

}
