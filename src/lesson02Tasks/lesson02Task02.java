package lesson02Tasks;

public class lesson02Task02 {
    public static void main(String[] args) {    // Program to sum values of an array
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : array)
            sum += i;
        System.out.println("The sum values of an array = " + sum);
    }
}
