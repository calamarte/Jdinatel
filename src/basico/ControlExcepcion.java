package basico;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ControlExcepcion {
    public static void main(String[] args) {

        File file = new File("/home/calamarte/Desktopp/prueba.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter pepino = new OutputStreamWriter(fos);

            pepino.write("hola soy un pepino");

            pepino.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try {
            testIOException();
            testException();
        } catch (IOException | RuntimeException e){
            System.out.println("IO or Run");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Generico");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Siempre imprime el siguiente comando");
        }

    }

    public static void testException() throws Exception {
        throw new Exception("Ha habido un problema");
    }

    public static void testIOException() throws IOException {
        throw new IOException("Excepción IO");
    }
}
