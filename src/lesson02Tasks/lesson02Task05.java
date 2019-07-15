package lesson02Tasks;

public class lesson02Task05 {
    public static boolean contains (int[] array, int value){   // Program to test if an array contains a specific value
        for (int n : array) {
            if (value == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(contains(array, 8));
        System.out.println(contains(array, 11));
    }
}
