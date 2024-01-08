package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.models.Mascota;
import com.mycompany.ejercicio2.models.RegistroMascotas;
import java.util.List;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Ejercicio 2: Veterinaria
        
        /**
         * Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se solicita la definición de una clase genérica Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o id de mascota para identificar a cada una). Crea una clase utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:
         * Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
         * Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
         * Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
         * Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios, como nombres, edades o especies, para agregar mascotas al registro.
         */
        
        RegistroMascotas registro = new RegistroMascotas();

        // Agregar mascotas manualmente
        registro.agregarMascota(new Mascota<>("Rina", 3, "Perro"));
        registro.agregarMascota(new Mascota<>("Mina", 2, "Gato"));
        registro.agregarMascota(new Mascota<>("Renekton", 1, "Reptil"));

        // Buscar mascotas por nombre
        List<Mascota<?>> mascotasPorNombre = registro.buscarPorNombre("Rina");
        System.out.println("Mascotas por nombre 'Rina':");
        mascotasPorNombre.forEach(System.out::println);

        // Buscar mascotas por especie
        List<Mascota<?>> mascotasPerro = registro.buscarPorEspecie("Perro");
        System.out.println("\nMascotas de especie 'Perro':");
        mascotasPerro.forEach(System.out::println);

        // Contar la cantidad total de mascotas registradas
        int totalMascotas = registro.contarMascotasRegistradas();
        System.out.println("\nTotal de mascotas registradas: " + totalMascotas);

        
    }
}
