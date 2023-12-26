package ejercicio2.models;


public class Zapato extends Vestimenta {
    
    //Atributos
    private String material;
    private String tipoCierre;

    
    //Constructores
    public Zapato() {
    }

    public Zapato(String material, String tipoCierre, int codigo, String nombre, int precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    //Metodos
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }
    
    @Override
    public void mensaje(){
        System.out.println("Estos zapatos son de marca: " + super.getMarca());
    }
    
}
