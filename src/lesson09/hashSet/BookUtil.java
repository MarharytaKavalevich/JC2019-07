package lesson09.hashSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class BookUtil {

    public static void printSet(Set<Book> books){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void startsWithVowel(Set<Book> books){
        String[] vowels = {"A", "E", "I", "O", "U"};
        List<Book> titlesStartsWithVowel = new ArrayList<>();
        for (Book book : books) {
            for (String vowel : vowels) {
                if(vowel.equals(book.getTitle().substring(0,1))){
                    titlesStartsWithVowel.add(book);
                    System.out.println(book);
                }
            }
        }
    }

    public static void sortedByAuthorLastName(Set<Book> books){
        Comparator<Book> lastNameComparator = Comparator.comparing(Book::getLastNameOfTheAuthor);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void sortedByAuthorFirstName(Set<Book> books){
        Comparator<Book> firstNameComparator = Comparator.comparing(Book::getFirstNameOfTheAuthor);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void sortedByAuthorMiddleName(Set<Book> books){
        Comparator<Book> middleNameComparator = Comparator.comparing(Book::getMiddleNameOfTheAuthor);
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
