package ejercicios;

import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la frase");
        String frase = sc.nextLine();

        String fraseLower = frase.toLowerCase();

        int vocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(isVocal(fraseLower.charAt(i))){
                vocales++;
            }
        }

        System.out.println("En la frase: " + frase + "\n" + "Hay " + vocales + " vocales");
    }

    public static boolean isVocal(char letra){
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':return true;
            default:return false;
        }
    }
}
