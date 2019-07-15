package lesson01;

import java.util.Scanner;

public class lesson01Task03 {
    public static void main(String[] args) {
        int num, temp, remainder, reverse = 0;
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;
        while (num > 0){
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        if (temp == reverse)
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number is not a palindrome");
    }
}
