package lesson01;

public class lesson01Task11 {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        int c = 34;
        if (a > b && a > c)
            System.out.println("наибольшее число = " + a);
        else if (b > a && b > c)
            System.out.println("наибольшее число = " + b);
        else
            System.out.println("наибольшее число = " + c);
    }
}
