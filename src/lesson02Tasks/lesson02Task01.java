package lesson02Tasks;

import java.util.Arrays;

public class lesson02Task01 {
    public static void main(String[] args) {        //  Program to sort a numeric array and a string array
        int[] num_array = {123, 234, 345, 456, 567, 678, 789, 890};
        String[] str_array = { "I", "Love", "Java", "!"};
        Arrays.sort(num_array);
        System.out.println(Arrays.toString(num_array));
        Arrays.sort(str_array);
        System.out.println(Arrays.toString(str_array));
    }
}
