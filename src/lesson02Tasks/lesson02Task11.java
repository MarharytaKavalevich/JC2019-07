package lesson02Tasks;

import java.util.Arrays;

public class lesson02Task11 {
    public static void main(String[] args) {   // Program to reverse an array of integer values
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length / 2; i++) {
            int x = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = x;
        }
    System.out.println("Reverse array : " + Arrays.toString(array));
    }
}

