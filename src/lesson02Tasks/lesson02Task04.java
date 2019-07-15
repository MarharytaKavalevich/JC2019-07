package lesson02Tasks;

public class lesson02Task04 {
    public static void main(String[] args) {    // Program to calculate the average value of array elements
        int[] elements = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i=0; i < elements.length ; i++)
            sum = sum + elements[i];
        double average_value = sum / elements.length;
        System.out.println("Average value of array elements = " + average_value);
    }
}
