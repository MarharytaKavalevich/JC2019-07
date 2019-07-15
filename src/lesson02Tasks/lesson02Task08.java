package lesson02Tasks;

import java.util.Arrays;

public class lesson02Task08 {
    public static void main(String[] args) {   // Program to copy an array by iterating the array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] new_array = new int[10];
        for(int i=0; i < array.length; i++) {
            new_array[i] = array[i];
        }
        System.out.println("New Array: " + Arrays.toString(new_array));
    }
}
