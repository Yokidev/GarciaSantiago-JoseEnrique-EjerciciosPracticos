package ejercicio2.models;


public class Sombrero extends Vestimenta {
   
    //Atributos
    private String tipo;
    private int tamaño;
    
    //Constructores

    public Sombrero() {
    }

    public Sombrero(String tipo, int tamaño, int codigo, String nombre, int precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }
    
    //Metodos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    @Override
    public void mensaje(){
        System.out.println("Este sombrero es de marca: " + this.tipo);
    }
    
}
