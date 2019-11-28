package ejercicios;

public class Caesar {
    public static void main(String[] args) {
        cypher("hgoitgh", 1);

    }

    public static String cypher(String text, int delta){
        StringBuilder sb = new StringBuilder();
        text = text.toLowerCase();

        int letra, cifrada;
        for (int i = 0; i < text.length(); i++) {
            letra = text.charAt(i);
            cifrada = letra + delta;

        }


        return null;
    }

    public static String decypher(String text, int delta){

        return null;
    }
}
