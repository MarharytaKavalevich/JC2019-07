package lesson06;

public class Lesson06 {
    public static void main(String[] args) {
        String text1 = "The simple text string";
        String text2 = "It is a simple string";

        String textUpperCase = text1.toUpperCase();
        System.out.println(textUpperCase);

        String textLowerCase = text2.toLowerCase();
        System.out.println(textLowerCase);

        boolean contains = text1.contains("simple");
        System.out.println(contains);

        System.out.println (text2.substring (8, 14));
    }
}
