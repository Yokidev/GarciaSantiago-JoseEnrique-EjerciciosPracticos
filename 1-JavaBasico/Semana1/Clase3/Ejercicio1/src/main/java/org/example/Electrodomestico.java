package org.example;

public class Electrodomestico {

    //Atributos
    int cod;
    String marca;
    String modelo;
    int consumo;
    String color;

    //Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(int cod,String marca,String modelo, int consumo,String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

}
