package org.example;

public class Main {
    public static void main(String[] args) {

        //Ejercicio Nº 2 - POO - Individual

        /*
        * Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
        a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
        d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
        * */

        //a)
        Persona[] personas = {
                new Persona(1,"Jose",31,"Sevilla",987456321),
                new Persona(2,"Adrian",29,"Cadiz",987458963),
                new Persona(3,"Sara",35,"Asturias",123456798),
                new Persona(4,"Clara",25,"Madrid",147852396),
                new Persona(5,"Cayetano",33,"Sevilla",654123987)
        };

        //b)
        System.out.println("*** Nombres y edad ***");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre " + personas[i].getNombre() + " edad " + personas[i].getEdad());
        }

        //c)
        System.out.println("*** Cambios de Nombre ***");

        System.out.println("Nombre persona 3 " + personas[2].getNombre());
        System.out.println("Nombre persona 4 " + personas[3].getNombre());

        personas[2].setNombre("Fran");
        personas[3].setNombre("Javi");

        System.out.println("Nombre persona 3 cambio a " + personas[2].getNombre());
        System.out.println("Nombre persona 4 cambio a " + personas[3].getNombre());

        //d)
        System.out.println("*** Personas mayores de 30 ***");
        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad()>30){
                System.out.println(personas[i].getNombre());
            }
        }


    }
}