package com.hackaboss.VentaAutos.service;

import com.hackaboss.VentaAutos.model.Automovil;

import java.util.List;

public interface IAutomovilService {

    public String addAuto(Automovil auto);
    public List<Automovil> getListAutos();
    public List<Automovil> getAutosByPrice();
    public Automovil getAutoById(Long id);
}
