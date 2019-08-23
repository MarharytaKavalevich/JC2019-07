package lesson10;

import java.util.HashSet;

public class BookDemoException {

    public static void main(String[] args) {
        Book book1 = new Book(1, "War and peace", "Tolstoy", "Lev", "Nikolaevich");
        Book book2 = new Book(2, "Crime and Punishment", "Dostoevsky", "Fedor", "Mikhailovich");
        Book book3 = new Book(3, "The Cherry Orchard", "Chekhov", "Anton", "Pavlovich");
        Book book4 = new Book(4, "Ruslan and Ludmila", "Pushkin", "Alexander", "Sergeyevich");

        HashSet<Book> set = new HashSet<Book>();
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);

        System.out.println("Information about books whose title begins with a vowel: ");

        // BookUtil.startsWithVowel(set);



    }
}












