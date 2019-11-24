package basico;

public class Iteraciones {
    public static void main(String[] args) {
        //Array
        int tamano = 10;
        int[] array = new int[tamano];
        char arrayConValores[] = {'a', 'b', 'c'};

        System.out.println("### WHILE ###");
        int contador = 0;
        while (contador < tamano){
            System.out.print(" " + array[contador] + " ");
            contador++;
        }

        System.out.print("\n");

        System.out.println("### FOR ###");
        for (int i = 0; i < arrayConValores.length; i++) {

            /*if (arrayConValores[i] == 'a'){
                continue;
            }*/

            /*if (arrayConValores[i] == 'b'){
                break;
            }*/

            System.out.print(" " + arrayConValores[i] + " ");
        }
    }
}
