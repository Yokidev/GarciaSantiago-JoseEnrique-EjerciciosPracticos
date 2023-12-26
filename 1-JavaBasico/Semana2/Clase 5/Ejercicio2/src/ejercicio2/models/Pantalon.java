package ejercicio2.models;

public class Pantalon extends Vestimenta {
    
    //Atributos
    private String estilo;
    private String tipoTejido;

    //Constructor
    public Pantalon() {
    }
    
    public Pantalon(String estilo, String tipoTejido, int codigo, String nombre, int precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }
    
    //Metodos

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }
    
    @Override
    public void mensaje(){
        System.out.println("Estos pantalones son de marca: " + this.estilo);
    }
    
}
