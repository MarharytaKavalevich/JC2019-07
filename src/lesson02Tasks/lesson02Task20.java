package lesson02Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class lesson02Task20 {
    public static void main(String[] args) {
        String[]  array = new String[] {"aaa", "bbb", "ccc", "ddd", "eee", "fff"};
        ArrayList<String>  list = new ArrayList<String>(Arrays.asList(array));
        System.out.println(list);
    }
}
