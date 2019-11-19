import java.util.Scanner;

public class ControlEjecuccion {
    public static void main(String[] args) {
        System.out.println("Valor");
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        //if
        System.out.println("### IF ###");
        if(valor > 0){
            System.out.println("es positivo");
        }else {
            System.out.println("es negativo");
        }

        //else if
        System.out.println("### IF ELSE ###");
        if(valor > 0){
            System.out.println("es positivo");
        }else if(valor == 0){
            System.out.println("es 0");
        }else {
            System.out.println("es negativo");
        }

        //switch
        System.out.println("### SWITCH ###");
        switch (valor){
            case 0: {
                System.out.println("es 0");
                break;
            }
            case 1: {
                System.out.println("es 1");
                break;
            }
            default:
                System.out.println("No lo se");
        }

    }
}
