package lesson02Tasks;

import java.util.Arrays;

public class lesson02Task12 {
    public static void main(String[] args) {   // Program to find the duplicate values of an array of integer values
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8, 1};
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("Duplicate value : " + array[j]);
                }
            }
        }
    }
}
