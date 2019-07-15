package lesson02Tasks;

import java.util.Arrays;

public class lesson02Task13 {
    public static void main(String[] args) {    //  Program to find the duplicate values of an array of string values
        String[] array = {"aaa", "bbb", "ddd", "eee", "aaa", "bbb", "fff"};
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if( (array[i].equals(array[j])) && (i != j) )
                {
                    System.out.println("Duplicate value : " + array[j]);
                }
            }
        }
    }
}
