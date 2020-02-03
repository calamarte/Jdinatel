package ejercicios;

import javax.swing.*;
import java.util.Arrays;

/**
 * https://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
 */
public class Fibonacci {
    public static void main(String[] args) {

        int max = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un numero"));

        int[] sucesion = new int[max];

        int previous = 0, next = 1;

        sucesion[0] = previous;

        int aux = 0;
        for (int i = 1; i < max; i++) {
            sucesion[i] = next;

            aux = next;
            next += previous;
            previous = aux;
        }

        print(sucesion);
        paint(sucesion);

    }

    public static void print(int[] n){
        System.out.println(Arrays.toString(n));
    }


    public static void paint(int[] sucession){

        int sizeY = sucession[sucession.length - 2] + 1;
        int sizeX = sucession[sucession.length - 1];

        char[][] frame = new char[sizeY][sizeX];
        clean(frame);

        String[] brujula ={
                "RIGHT",
                "DOWN",
                "LEFT",
                "UP"
        };

        int[] coords = {0, 0};
        int brujulaIndex = 0;
        String go = brujula[brujulaIndex];
        char ch = '-';

        for (int i = sucession.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < sucession[i]; j++) {
                if (i < sucession.length -1 || j > 0){
                    ch = nextIndexs(coords, go);
                }

                frame[coords[0]][coords[1]] = ch;
            }

            brujulaIndex = (brujulaIndex + 1) == brujula.length ? 0 : brujulaIndex + 1;
            go = brujula[brujulaIndex];
        }

        printFrame(frame);
    }


    public static char nextIndexs(int[] coords, String go){
        switch (go){
            case "UP": {
                coords[0]--;
                return '|';
            }
            case  "DOWN":{
                coords[0]++;
                return '|';
            }
            case "RIGHT":{
                coords[1]++;
                return '-';
            }
            case "LEFT":{
                coords[1]--;
                return '-';
            }
        }
        return '$';
    }


    public static void printFrame(char[][] frame){
        for (int i = 0; i < frame.length; i++) {
            for (int j = 0; j < frame[0].length; j++) {
                System.out.print(frame[i][j]);
            }

            System.out.print("\n");
        }
    }

    public static void clean(char[][] frame){
        for (int i = 0; i < frame.length; i++) {
            for (int j = 0; j < frame[0].length; j++) {
                frame[i][j] = ' ';
            }
        }
    }


}
