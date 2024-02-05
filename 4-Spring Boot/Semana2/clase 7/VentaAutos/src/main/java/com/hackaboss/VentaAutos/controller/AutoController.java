package com.hackaboss.VentaAutos.controller;

import com.hackaboss.VentaAutos.model.Automovil;
import com.hackaboss.VentaAutos.service.AutomovilSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class AutoController {

    @Autowired
    AutomovilSV automovilSV;

    @PostMapping("vehicles")
    public String addAuto(@RequestBody Automovil automovil){
        return automovilSV.addAuto(automovil);
    }

    @GetMapping("vehicles")
    public List<Automovil> getListAutos(){
        return automovilSV.getListAutos();
    }

    @GetMapping("vehicles/prices")
    public List<Automovil> getAutosByPrice(){
        return automovilSV.getAutosByPrice();
    }

    @GetMapping("vehicles/{id}")
    public Automovil getAutoById(@PathVariable Long id){
        return automovilSV.getAutoById(id);
    }

}
