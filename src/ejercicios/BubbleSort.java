package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(",");

        int[] numbers = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            numbers[i] = Integer.parseInt(data[i]);
        }

        sort(numbers);

        System.out.println(Arrays.toString(numbers));

    }


    private static void sort(int[] numbers) {

        if (numbers == null || numbers.length == 1) return;

        int previous, current, aux;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {

                previous = numbers[j - 1];
                current = numbers[j];

                if (previous > current) {
                    aux = previous;
                    previous = current;
                    current = aux;

                    numbers[j - 1] = previous;
                    numbers[j] = current;
                }

            }

        }

    }

}
