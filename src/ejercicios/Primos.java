package ejercicios;

import java.util.Scanner;

/**
 * Números primos: https://es.wikipedia.org/wiki/N%C3%BAmero_primo
 */

public class Primos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Número máximo");
        int max = sc.nextInt();

        System.out.println("Los valores primos hasta "+ max +" :");

        for (int i = 2; i <= max; i++) {
            if(isPrime(i)){
                System.out.print(" " + i + " ");
            }
        }


    }

    public static boolean isPrime(int value){
        for (int i = 2; i < value; i++) {
            if(value % i == 0){
                return false;
            }
        }

        return true;
    }
}
