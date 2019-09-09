package lesson15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lines {

    // Прочитайте строки из файла и поменяйте местами первые и последние слова в каждой строке.

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String[] rows = new Scanner(new File("C:\\Users\\37529\\IdeaProjects\\JD2019-07-NEW\\lines.txt")).useDelimiter("\\Z").next().split("// ");
        String[] f1 = new String[rows.length];

        for (int i = 0; i < f1.length; i++) {
            f1[i] = rows[i].trim().replaceAll("(?m)(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
        }
        for (String s : f1) {
            System.out.println(s);
        }
    }
}
