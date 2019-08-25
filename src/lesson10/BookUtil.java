package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BookUtil {

    public static void startsWithVowel(Set<Book> books)  {
        String[] vowels = {"A", "E", "I", "O", "U"};
        List<Book> titlesStartsWithVowel = new ArrayList<>();
        for (Book book : books) {
            for (String vowel : vowels) {
                if (vowel.equals(book.getTitle().substring(0, 1))) {
                    titlesStartsWithVowel.add(book);
                    System.out.println(book);
                }
            }
        }
        throw new ResourceNotFoundException();
    }
}