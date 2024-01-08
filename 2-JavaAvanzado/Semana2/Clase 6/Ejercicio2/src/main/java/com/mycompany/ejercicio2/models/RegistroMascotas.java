package com.mycompany.ejercicio2.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RegistroMascotas {
    private List<Mascota<?>> registro;

    public RegistroMascotas() {
        this.registro = new ArrayList<>();
    }

    // Agregar Mascotas al Registro
    public <T> void agregarMascota(Mascota<T> mascota) {
        registro.add(mascota);
    }

    // Buscar Mascotas por Nombre
    public List<Mascota<?>> buscarPorNombre(String nombre) {
        return registro.stream()
                .filter(mascota -> mascota.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    // Buscar Mascotas por Especie
    public <T> List<Mascota<?>> buscarPorEspecie(T especie) {
        return registro.stream()
                .filter(mascota -> mascota.getEspecie().equals(especie))
                .collect(Collectors.toList());
    }

    // Contar la Cantidad Total de Mascotas Registradas
    public int contarMascotasRegistradas() {
        return registro.size();
    }

    
}
