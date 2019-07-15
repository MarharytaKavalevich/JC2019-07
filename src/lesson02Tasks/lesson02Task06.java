package lesson02Tasks;

public class lesson02Task06 {
    public static int  findIndex (int[] array, int x) {   // Program to find the index of an array element
        if (array == null) return -1;
        int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == x) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Index of 8 = " + findIndex(array, 8));
    }
}
