package ejercicio2.models;


public class Camiseta extends Vestimenta {
    
    //Atributos
    private String manga;
    private String cuello;
    
    //Constructores
    public Camiseta() {
    }

    public Camiseta(String manga, String cuello, int codigo, String nombre, int precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }
    
    //Metodos

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }
    
    @Override
    public void mensaje(){
        System.out.println("Esta camiseta es de marca: " + this.manga);
    }
            
}
