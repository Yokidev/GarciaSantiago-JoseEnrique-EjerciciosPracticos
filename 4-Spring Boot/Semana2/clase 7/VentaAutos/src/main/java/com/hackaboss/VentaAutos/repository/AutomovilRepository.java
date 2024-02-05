package com.hackaboss.VentaAutos.repository;

import com.hackaboss.VentaAutos.model.Automovil;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AutomovilRepository {

    private List<Automovil> listAutos = new ArrayList<>(Arrays.asList(
            new Automovil(1L,"Toyota", "Corolla", "5000", 4, 25000.0),
            new Automovil(2L,"Honda", "Civic", "8000", 4, 27000.0),
            new Automovil(3L, "Ford", "Mustang", "2000", 2, 40000.0),
            new Automovil(4L,"Chevrolet", "Camaro", "1500", 2, 45000.0),
            new Automovil(5L,"BMW", "3 Series", "10000", 4, 35000.0),
            new Automovil(6L,"Mercedes-Benz", "E-Class", "6000", 4, 50000.0),
            new Automovil(7L,"Audi", "A4", "7000", 4, 38000.0),
            new Automovil(8L,"Tesla", "Model S", "500", 4, 60000.0),
            new Automovil(9L,"Volkswagen", "Golf", "12000", 4, 28000.0),
            new Automovil(10L,"Subaru", "Impreza", "3000", 4, 32000.0)
    ));

    public String addAuto(Automovil auto){

        listAutos.add(auto);
        return "Auto creado";
    }

    public List<Automovil> getListAutos(){
        return listAutos;
    }


    public Automovil getAutoById(Long id){
        return listAutos.stream()
                .filter(automovil -> automovil.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
