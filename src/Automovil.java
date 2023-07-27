public class Automovil {
    private String marca;
    private String modelo;
    private int anioFrabricacion;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int anioFrabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFrabricacion = anioFrabricacion;
    }


    void acelerar(){
        System.out.println("Estamos acelerando");
    }

    String frenar(){
        return "Estamos frenando";
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public int getAnioFrabricacion(){
        return this.anioFrabricacion;
    }

}
