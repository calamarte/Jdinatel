package ejercicios.objetos;

public class Person {

    private String nombre;
    private String apellido;
    private boolean caminando;

    public void camina(){
        caminando = true;
        showStatus();
    }

    public void para(){
        caminando = false;
        showStatus();
    }

    private void showStatus(){
        if(caminando){
            System.out.println(toString() + " esta caminando");
            return;
        }

        System.out.println(toString() + " esta parado");
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
