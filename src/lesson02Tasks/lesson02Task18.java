package lesson02Tasks;

public class lesson02Task18 {
    public static void main(String[] args) {   // Program to find the second smallest element in an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == min){
                second_min = min;
            } else if (array[i] < min) {
                second_min = min;
                min = array[i];
            } else if (array[i] < second_min) {
                second_min = array[i];
            }
        }
        System.out.println("Second lowest number is : " + second_min);
    }
}
