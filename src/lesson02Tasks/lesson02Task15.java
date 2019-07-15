package lesson02Tasks;

import java.util.Arrays;

public class lesson02Task15 {
    public static void main(String[] args) {  // Program to find the common elements between two arrays of integers
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                    System.out.println("Common element : " + (array1[i]));
                }
            }
        }
    }
}
