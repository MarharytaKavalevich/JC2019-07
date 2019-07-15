package lesson01;

import java.util.Scanner;

public class lesson01Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество суток");
        int number = scanner.nextInt();
        System.out.println("Количество часов = " + number * 24);
        System.out.println("Количество минут = " + number * 24 * 60);
        System.out.println("Количество секунд = " + number * 24 * 60 * 60);
    }
}
