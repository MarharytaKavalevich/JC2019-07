package lesson09.linkedList;

import java.util.LinkedList;
import java.util.List;

public class BookDemoLinkedList {

    public static void main(String[] args) {
        Book book1 = new Book(1, "War and peace", "Tolstoy");
        Book book2 = new Book(2, "Crime and Punishment", "Dostoevsky");
        Book book3 = new Book(3, "The Cherry Orchard", "Chekhov");

        List<Book> list = new LinkedList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);

        System.out.println("Books information: ");
        BookUtil.printList(list);
        System.out.println();

        list.remove(1);

        System.out.println("Information about the remaining books: ");
        BookUtil.printList(list);
        System.out.println();
    }
}












