package ejercicio1;

import ejercicio1.models.Auto;
import ejercicio1.models.Camioneta;
import ejercicio1.models.Moto;
import ejercicio1.models.Vehiculo;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
        
        // Ejercicio Nº 1 - Collections, Clases Abstractas e Interfaces - Grupal
        
        /*
        Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de venta de autos. Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.
        a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.

        b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia() y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases, deben mostrar un mensaje de qué tipo de recarga están haciendo.

        c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.

        d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

        e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

        f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.

        g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.
        */
        
        // F y G)
        Vehiculo cocheElectrico = new Auto(40000, 48, 1, "0256MGL", "Mazda", 2018, 20500);
        Vehiculo camionetaCombustion = new Camioneta(4000, 7, 2, "6589PRE", "Mercedes", 2015, 32000);
        Vehiculo motoCombustion = new Moto(600,"Tetracilíndricos", 3, "7845ZSA", "Yamaha", 2020, 15000);
        
        ArrayList<Vehiculo> concesionario = new ArrayList();
        
        concesionario.add(cocheElectrico);
        concesionario.add(camionetaCombustion);
        concesionario.add(motoCombustion);
        
        //Recorremos el array y mostramos la informacion
        for(Vehiculo vehiculo: concesionario){
            System.out.println(vehiculo);
            System.out.println("La antiguedad de este vehiculo es de "+vehiculo.antiguedad()+" años");
            //Segun el tipo de dato que sea vehiculo podra lanzar un metodo u otro
            if (vehiculo instanceof Auto) {
                ((Auto) vehiculo).cargarEnergia();
            }
            if (vehiculo instanceof Camioneta) {
                ((Camioneta) vehiculo).recargarCombustible();
            }
            if (vehiculo instanceof Moto) {
                ((Moto) vehiculo).recargarCombustible();
            }
        }
        
    }
    
}
