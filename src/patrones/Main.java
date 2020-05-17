package patrones;

public class Main {
    public static void main(String[] args) {

        Singleton value1 = Singleton.getSingleton();
        Singleton value2 = Singleton.getSingleton();

        //Las referencias deben ser iguales puesto que es la misma instancia
        System.out.println(value1 + " "+  value2);

        Prototype pro1 = Prototype.getPrototype();
        Prototype pro2 = Prototype.getPrototype();

        //Las referencias deben ser distintas, no es la misma instancia
        System.out.println(pro1 + " " + pro2);

    }
}
