package lesson02Tasks;

import java.util.Arrays;

public class lesson02Task09 {    // Program to insert an element into an array
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int Index_position = 2;
        int newValue = 11;
        for(int i=array.length-1; i > Index_position; i--){
            array[i] = array[i-1];
        }
        array[Index_position] = newValue;
        System.out.println("New Array: " + Arrays.toString(array));
    }
}
