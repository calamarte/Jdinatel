package ejercicios;

import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un frase");
        String text = sc.nextLine();

        System.out.println("Kebab-case: " + toKebab(text));
        System.out.println("Snake_case: " + toSnake(text));
        System.out.println("CamelCase: " + toCamel(text));
    }

    public static String toCamel(String text){
        String [] split = text.split(" ");

        if(split.length < 2){
            return text;
        }

        for (int i = 1; i < split.length; i++) {
            split[i] = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
        }

        return String.join("", split);
    }

    public static String toSnake(String text){
        return text.replaceAll(" ", "_");
    }

    public static String toKebab(String text){
        return text.replaceAll(" ", "-");
    }
}
