package lesson09.linkedList;

import java.util.List;

public class BookUtil {

    public static void printList(List <Book> books){
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
