package lesson02Tasks;

import java.util.*;

public class lesson02Task14 {
    public static void main(String[] args) {   // Program to find the common elements between two arrays
        String[] array1 = {"aaa", "bbb", "ccc", "ddd", "eee", "fff"};
        String[] array2 = {"bbb", "eee", "ggg", "hhh", "jjj", "kkk"};
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    set.add(array1[i]);
                }
            }
        }
        System.out.println("Common elements : " + (set));
    }
}
