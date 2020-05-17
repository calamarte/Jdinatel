package patrones;

public class Prototype implements Cloneable {

    private static Prototype prototype = new Prototype();

    private Prototype(){

    }

    public static Prototype getPrototype() {
        try {
            return (Prototype) prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }


}
