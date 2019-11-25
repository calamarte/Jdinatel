package ejercicios;

import java.util.Scanner;

/**
 * ax² + bx + c = 0
 *
 *       __________________
 * -b ± \/ (b)² - 4 * c * a
 * ────────────────────────
 *           2 * a
 *
 *  Para probar: https://www.superprof.es/apuntes/escolar/matematicas/algebra/ecuaciones/ejercicios-ecuaciones-de-segundo-grado.html
 */
public class Ecuacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe los valores de la ecuacion separados por una coma \n" +
                "Ejemplo: a,b,c");

        String[] input = sc.nextLine().replaceAll(" ", "").split(",");

        int
                a = Integer.parseInt(input[0]),
                b = Integer.parseInt(input[1]),
                c = Integer.parseInt(input[2]);

        double sqrt = sqrt(a, b, c);

        double restul1 = (-b + sqrt) / 2*a;
        double restul2 = (-b - sqrt) / 2*a;

        System.out.println("Resultado 1: " + restul1);
        System.out.println("Resultado 2: " + restul2);
    }


    public static double sqrt(int a, int b, int c){
        double interior = (b*b) - (4 * c * a);
        return Math.sqrt(interior);
    }

}
