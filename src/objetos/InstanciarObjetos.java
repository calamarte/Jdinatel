package objetos;

import java.util.Arrays;

public class InstanciarObjetos {
    public static void main(String[] args) {

        String s = new String();

        s = "hola esta asignacion no tiene sentido";

        //Metodos interesantes de String
        System.out.println(".length() saber longitud: " + s.length() );
        System.out.println(".charAt(int indice): " + s.charAt(0));
        System.out.println("String.valueOf(): " + String.valueOf(15));
        System.out.println(".toUpperCase(): " + s.toUpperCase());
        System.out.println(".toLowerCase(): " + s.toLowerCase());
        System.out.println(".equals(): " + s.equals(s));
        System.out.println(".equalsIgnoreCase(): " +s.equalsIgnoreCase(s));
        System.out.println(".substring(int start): " + s.substring(3));
        System.out.println(".substring(int start, int end): " + s.substring(4, 4));
        System.out.println(".starsWith(String s): " + s.startsWith("hola"));
        System.out.println(".endWith(String s): " + s.endsWith("sentido"));
        System.out.println(".contains(String s): " + s.contains("no"));
        System.out.println(".replaceAll(): " + s.replaceAll(" ", "-"));
        System.out.println(".split()" + Arrays.toString(s.split(" ")));

        System.out.println("################### StringBuilder ###################");

        //Objeto para crear Strings
        StringBuilder sb = new StringBuilder();

        sb.append("hola");
        sb.append(" ");
        sb.append("mundo");

        System.out.println("Monto el String: " + sb.toString());
    }
}
