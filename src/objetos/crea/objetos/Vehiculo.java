package objetos.crea.objetos;

public class Vehiculo {
    //Variable local
    public static int vehiculosCreados = 0;

    //Varible de instancia
    private final int ruedas;

    public Vehiculo(int ruedas){
        this.ruedas = ruedas;
        vehiculosCreados++;
    }

    void avanza(){
        System.out.println("avanzando!!");
    }

    protected void retrocede(){
        System.out.println("retrocediendo");
    }

}
