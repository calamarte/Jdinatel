public class Operadores {
    public static void main(String[] args) {
        int value = 5;
        int value2 = 10;

        //Matemáticos
        System.out.println("### Matemáticos ###");
        System.out.println("Suma: " + (value + value2));
        System.out.println("Resta: " + (value2 - value));
        System.out.println("Division: " + value2 / value);
        System.out.println("Resto: " + value2 % value);

        //Atajos
        value = value + value2;
        value += value2;

        value++;
        value--;

        //Racionales
        System.out.println("### Racinales ###");
        System.out.println("Mayor: " + (value > value2));
        System.out.println("Menor: " + (value <= value2));
        System.out.println("Igual: " + (value == value2));
        System.out.println("Diferente: " + (value != value2));

        boolean is = true, notIs = false;
        System.out.println("AND: " + (is && notIs));
        System.out.println("OR: " + (is || notIs));
        System.out.println("NOT: " + !is);

    }
}
