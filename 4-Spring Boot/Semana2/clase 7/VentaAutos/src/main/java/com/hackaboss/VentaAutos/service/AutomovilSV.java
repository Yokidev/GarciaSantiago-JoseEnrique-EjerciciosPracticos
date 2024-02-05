package com.hackaboss.VentaAutos.service;

import com.hackaboss.VentaAutos.model.Automovil;
import com.hackaboss.VentaAutos.repository.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class AutomovilSV implements IAutomovilService {

    @Autowired
    private AutomovilRepository automovilRepository;

    @Override
    public String addAuto(Automovil auto) {
        return automovilRepository.addAuto(auto);
    }

    @Override
    public List<Automovil> getListAutos() {
        return automovilRepository.getListAutos();
    }

    @Override
    public List<Automovil> getAutosByPrice() {
        List<Automovil> autoListByPrice = automovilRepository.getListAutos();
        Collections.sort(autoListByPrice, Comparator.comparingDouble(Automovil::getPrice));
        return autoListByPrice;
    }

    @Override
    public Automovil getAutoById(Long id) {
        return automovilRepository.getAutoById(id);
    }
}
