package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.models.Plato;
import com.mycompany.ejercicio2.persistencia.ControladoraPersistencia;
import java.util.List;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        // Ejercicio Nº 2 - JPA - Individual
        
        /**
         * Un restaurante necesita un programa para almacenar en una base de datos sus diferentes platillos del menú. De cada uno de estos se almacena: id, nombre, receta, precio.
        Sabiendo esto:
        Crear una base de datos llamada restaurante. Dejarla completamente vacía.
        Realizar las configuraciones necesarias para implementar JPA en el proyecto. Esto incluye:
        *Mapeo mediante annotations
        *Creación de la unidad de persistencia
        *Creación de los paquetes para representar capas (logica y persistencia)
        *Creación de las clases controladoras: para la lógica y para la persistencia.
        *Creación de los respectivos JPA Controller.
        *Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.
        *Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los datos de otro mediante JPA.
        *Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.
        */
        
        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
        
        //Creamos un plato
        Plato plato1 = new Plato("Bocadillo de Tortilla", "Pan, huevos, aceite", 3);
        
        //Lo añadimos a la base de datos
        controladoraPersistencia.crearPlato(plato1);
        
        //Creamos 2 mas
        Plato plato2 = new Plato("Pizza 4 quesos", "masa, tomate, oregano, mozzarella, gouda, chedar, elemental", 9);
        controladoraPersistencia.crearPlato(plato2);
        Plato plato3 = new Plato("Fajitas de Pollo", "tortita de trigo, pimientos, cebolla, pollo, especias", 5);
        controladoraPersistencia.crearPlato(plato3);
        
        //Eliminamos 1
        controladoraPersistencia.borrarPlato(1);
        
        //Modificamos otro
        plato2.setPrecio(18);
        controladoraPersistencia.modificarPlato(plato2);
        
        //Mostramos los platos
        List<Plato> listaPlatos = controladoraPersistencia.traerPlatos();
        
        System.out.println("<<Lista Platos>>");
        for(Plato plato: listaPlatos){
            System.out.println(plato.toString());
        }
        
    }
}
