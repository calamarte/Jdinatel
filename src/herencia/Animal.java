package herencia;

public class Animal {


    public Animal(){

    }

    public void comer(){
        System.out.println("Animal comiendo");
    }

    public void beber(){
        System.out.println("Animal bebiendo ...");
    }

    @Override
    public String toString() {
        return "Soy el padre";
    }

}
