/**
 * No pueden empezar por número.
 * No pueden repetir misma nombre (Scope)
 *
 * Estandar variables "camelCase"
 */
public class Variables {
    public static void main(String[] args) {

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.4028235E38F;
        double d = 1.7976931348623157E308D;
        char c = 'a'; //￿
        boolean bool = true;

        String string = "hola mundo";

        String msg = "Byte: " + b + "\n" +
                "Short: " + s + "\n" +
                "Integer: " + i + "\n" +
                "Long: " + l + "\n" +
                "Float: " + f + "\n" +
                "Double: " + d + "\n" +
                "Character: " + c + "\n" +
                "Boolean: " + bool + "\n" +
                "String: " + string;

        System.out.print(msg);
    }
}
