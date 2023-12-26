package com.mycompany.ejercicio2.persistencia;

import com.mycompany.ejercicio2.models.Plato;
import com.mycompany.ejercicio2.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    PlatosJpaController platoJPA = new PlatosJpaController();
    
    public void crearPlato(Plato plato){
        platoJPA.create(plato);
    }
    
    public void borrarPlato(int id) {
      try {
          platoJPA.destroy(id);
      } catch (NonexistentEntityException ex){
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    public List<Plato> traerPlatos () {
      return platoJPA.findPlatosEntities();
    }
    
    public void modificarPlato(Plato plato){
        try{
            platoJPA.edit(plato);
        }catch(Exception ex){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
