package ejercicios.objetos;

public class Coche {

     public enum TiposCoche{
        ELECTRICO,
        DIESEL,
        GASOLINA
    }

    private static int cochesCreados = 0;

    private String color;
    private String modelo;
    private int puertas = 0;
    private TiposCoche tipo = TiposCoche.DIESEL;


    public Coche(String color, TiposCoche tipo){
        this.color = color;
        this.tipo = tipo;
        cochesCreados++;
    }

    public void circular(){

    }

    public void arrancar(){
        System.out.println("rrrrrrrum...");
    }

    public void parar(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
