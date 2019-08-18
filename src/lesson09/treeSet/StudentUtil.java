package lesson09.treeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class StudentUtil {

    public static void printEvenStudents(SortedSet<Student> set){
        List<Student> list = new ArrayList<>(set);
        for (Student student : list) {
            if (student.getId() % 2 == 0) {                                                                                                 // or ((list.indexOf(student) + 1) % 2 == 0)
                System.out.println(student);
            } else{
                set.remove(student);
            }
        }
    }

}
