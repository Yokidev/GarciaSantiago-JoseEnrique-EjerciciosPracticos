package ejercicio2;

import ejercicio2.models.Camiseta;
import ejercicio2.models.Pantalon;
import ejercicio2.models.Sombrero;
import ejercicio2.models.Vestimenta;
import ejercicio2.models.Zapato;


public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        //Ejercicio Nº 2 - Herencia y Polimorfismo - Individual
        
        /*
        Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).

        a) Crear las siguientes clases hijas que compartan sus atributos y métodos:

        Zapato: material, tipoCierre
        Pantalon: estilo, tipoTejido
        Camiseta: manga, cuello
        Sombrero: tipo, tamaño

        b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).

        c) Crear los siguientes métodos (en cada subclase correspondiente):

        Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).
        Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).
        Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).
        Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).

        d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
        */
        
        
        //b) 
        Vestimenta[] armario = {
            new Zapato("Cuero","Cordones",1,"Zapatillas",60,"Nike","44","Blancos"),
            new Zapato("Goma","Velcro",12,"Crocs",30,"Crocs","43","Azul"),
            new Zapato("Cuero","Cordones",13,"Zapatos",60,"Giorgio Armani","42","Marron"),
            new Pantalon("Fit","Jean",4,"Vaquero",20,"Levis","43","Azul"),
            new Pantalon("Regular","Tela",6,"Chino",20,"Zara","46","Negro"),
            new Pantalon("Overzise","Jean",7,"Vaquero",20,"HyM","42","Gris"),
            new Camiseta("Larga", "Alto",9,"Camiseta",20,"Pull and Bear","L","Verde"),
            new Camiseta("Corta","Normal",10,"Camisa",25,"Zara","M","Azul"),
            new Sombrero("Bombin",30,19,"Bombin clasico",200,"Lierys","L","Negro")
        };
        
        
        //d)
        for(int i = 0; i < armario.length; i++){
            armario[i].mensaje();
        }
        
        
    }
    
}
