package lesson09.treeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class StudentDemo {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Ivanov");
        Student student2 = new Student(2, "Petrov");
        Student student3 = new Student(3, "Sidorov");
        Student student4 = new Student(4, "Smirnov");
        Student student5 = new Student(5, "Sokolov");
        Student student6 = new Student(6, "Kozlov");

        SortedSet<Student> sortedSet = new TreeSet<Student>();
        sortedSet.add(student1);
        sortedSet.add(student2);
        sortedSet.add(student3);
        sortedSet.add(student4);
        sortedSet.add(student5);
        sortedSet.add(student6);

        System.out.println("Information about each even student: ");
        StudentUtil.printEvenStudents(sortedSet);

    }
}












