package basico;

public class Encapsulacion {
    public static void main(String[] args) {

        say("hola", 1);

    }


    public static void say(String msg, int repeat){
        for (int i = 0; i < repeat; i++) {
            say(msg);
        }
    }

    public static void say(String msg){
        System.out.println(getOSName() + " say: " + msg);
    }

    public static String getOSName(){

        String name = System.getProperty("os.name");

        return name;
    }



}
