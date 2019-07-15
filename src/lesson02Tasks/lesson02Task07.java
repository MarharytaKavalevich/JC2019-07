package lesson02Tasks;

import java.util.Arrays;

public class lesson02Task07 {
    public static void main(String[] args) {   // Program to remove a specific element from an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int removeIndex = 1;
        for (int i = removeIndex; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("After removing the second element: " + Arrays.toString(array));
    }
}
