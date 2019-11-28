package objetos;

import java.util.Arrays;

public class Referencias {

    public static void main(String[] args) {
        int[] array = new int[3];
        int[] array2 = array;

        array2[0] = 10;

        System.out.println("array: " + array);
        System.out.println("array2: " + array2);
    }

}
