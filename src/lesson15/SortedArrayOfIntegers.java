package lesson15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class SortedArrayOfIntegers {

    /* Создать и заполнить файл случайными целыми числами.
    Отсортировать содержимое файла по возрастанию.
    По итогу получить файл с отсортированным массивом чисел
     */

    public static void main(String[] args) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter("integers.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);

            int arr[] = new int[10];
            printWriter.println("Random integers: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
                printWriter.print(arr[i] + "  ");
            }
            printWriter.println("\nSorted: ");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                printWriter.print(arr[i] + "  ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }
}



