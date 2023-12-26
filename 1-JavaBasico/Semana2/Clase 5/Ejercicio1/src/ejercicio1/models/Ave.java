package ejercicio1.models;


public class Ave extends Animal{
    
    //Atributos
    private int envergaduraAlas;
    private String tipoVuelo;
    private String colorPluma;
    private String tipoPico;
    
    //Constructores
    
    
    
    //Metodos

    public Ave() {
    }

    public Ave(int envergaduraAlas, String tipoVuelo, String colorPluma, String tipoPico) {
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPluma = colorPluma;
        this.tipoPico = tipoPico;
    }
    
    public Ave(int envergaduraAlas, String tipoVuelo, String colorPluma, String tipoPico, int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPluma = colorPluma;
        this.tipoPico = tipoPico;
    }
    
   //Metodos

    public int getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(int envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorPluma() {
        return colorPluma;
    }

    public void setColorPluma(String colorPluma) {
        this.colorPluma = colorPluma;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave.");
    }
        
}
