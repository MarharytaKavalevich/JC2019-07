package lesson09.hashSet;

import java.util.HashSet;

public class BookDemoHashSet {

    public static void main(String[] args) {
        Book book1 = new Book(1, "War and peace", "Tolstoy", "Lev", "Nikolaevich");
        Book book2 = new Book(2, "Crime and Punishment", "Dostoevsky", "Fedor", "Mikhailovich");
        Book book3 = new Book(3, "The Cherry Orchard", "Chekhov", "Anton", "Pavlovich");
        Book book4 = new Book(4, "Eugene Onegin", "Pushkin", "Alexander", "Sergeyevich");
        Book book5 = new Book(5, "Ruslan and Ludmila", "Pushkin", "Alexander", "Sergeyevich");
        Book book6 = new Book(6, "Ruslan and Ludmila", "Pushkin", "Alexander", "Sergeyevich");
        Book book7 = new Book(7, "Captain's daughter", "Pushkin", "Alexander", "Sergeyevich");
        Book book8 = new Book(8, "Fathers and sons", "Turgenev", "Ivan", "Sergeyevich");
        Book book9 = new Book(9, "Fathers and sons", "Turgenev", "Ivan", "Sergeyevich");
        Book book10 = new Book(10, "Asya", "Turgenev", "Ivan", "Sergeyevich");
        Book book11 = new Book(11, "Sparrow", "Turgenev", "Ivan", "Sergeyevich");
        Book book12 = new Book(12, "Sparrow", "Turgenev", "Ivan", "Sergeyevich");
        Book book13 = new Book(13, "Notes of the Hunter", "Turgenev", "Ivan", "Sergeyevich");
        Book book14 = new Book(14, "Anna Karenina", "Tolstoy", "Lev", "Nikolaevich");
        Book book15 = new Book(15, "Adolescence", "Tolstoy", "Lev", "Nikolaevich");
        Book book16 = new Book(16, "Adolescence", "Tolstoy", "Lev", "Nikolaevich");
        Book book17 = new Book(17, "Taras Bulba", "Gogol", "Nikolai", "Vasilievich");
        Book book18 = new Book(18, "Evenings on a farm near Dikanka", "Gogol", "Nikolai", "Vasilievich");
        Book book19 = new Book(19, "The Story of Captain Kopeikin", "Gogol", "Nikolai", "Vasilievich");
        Book book20 = new Book(20, "Examiner", "Gogol", "Nikolai", "Vasilievich");
        Book book21 = new Book(21, "Dead Souls", "Gogol", "Nikolai", "Vasilievich");
        Book book22 = new Book(22, "Dead Souls", "Gogol", "Nikolai", "Vasilievich");
        Book book23 = new Book(23, "Thunderstorm", "Ostrovsky", "Alexander", "Nikolaevich");
        Book book24 = new Book(24, "Poverty is not a vice", "Ostrovsky", "Alexander", "Nikolaevich");
        Book book25 = new Book(25, "Dowry", "Ostrovsky", "Alexander", "Nikolaevich");

        HashSet<Book> set = new HashSet<Book>();
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);
        set.add(book5);
        set.add(book6);
        set.add(book7);
        set.add(book8);
        set.add(book9);
        set.add(book10);
        set.add(book11);
        set.add(book12);
        set.add(book13);
        set.add(book14);
        set.add(book15);
        set.add(book16);
        set.add(book17);
        set.add(book18);
        set.add(book19);
        set.add(book20);
        set.add(book21);
        set.add(book22);
        set.add(book23);
        set.add(book24);
        set.add(book25);

        System.out.println("Information about books whose title begins with a vowel: ");
        BookUtil.startsWithVowel(set);
        System.out.println();

        System.out.println("Сollection sorted by author last name: ");
        BookUtil.sortedByAuthorLastName(set);
        System.out.println();

        System.out.println("Сollection sorted by author first name: ");
        BookUtil.sortedByAuthorFirstName(set);
        System.out.println();

        System.out.println("Сollection sorted by author middle name: ");
        BookUtil.sortedByAuthorMiddleName(set);

    }
}












