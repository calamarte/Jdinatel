package herencia;

public class Gato extends Animal {

    @Override
    public void comer() {
        System.out.println("Gato comiendo");
    }

    @Override
    public void beber() {
        System.out.println("Bebiendo leche");
    }

    public void maullar(){
        System.out.println("miau");
    }
}
