package herencia;

public class Main {
    public static void main(String[] args) {
        Animal p = new Gato();


        if(p instanceof Gato){

            Gato g = (Gato) p;
            g.maullar();
        }

        p.beber();
    }
}
