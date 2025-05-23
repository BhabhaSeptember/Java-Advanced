package lesson07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable {

    public static void main(String[] args) {
//EXAMPLE1: USING SET INTERFACE 
//Sets do not allow duplicates
        System.out.println("===== Set Interface Example =====\n");
        Set<ComparableStudent> studentList = new TreeSet<>();

        ComparableStudent student1 = new ComparableStudent("Thomas Jefferson", 1111, 3.8);
        ComparableStudent student2 = new ComparableStudent("John Adams", 2222, 3.9);
        ComparableStudent student3 = new ComparableStudent("George Washington", 3333, 3.4);
        ComparableStudent student4 = new ComparableStudent("John Adams", 4444, 3.0);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        for (ComparableStudent student : studentList) {
            System.out.println(student);
        }

//EXAMPLE2: USING LIST INTERFACE 
//List interface allows for duplicates
        System.out.println("===== List Interface Example =====\n");
        List<ComparableStudent> studentList2 = new ArrayList();

        studentList2.add(new ComparableStudent("Thomas Jefferson", 1111, 3.8));
        studentList2.add(new ComparableStudent("John Adams", 2222, 3.9));
        studentList2.add(new ComparableStudent("John Adams", 4444, 3.0));
        studentList2.add(new ComparableStudent("George Washington", 3333, 3.4));
        Collections.sort(studentList2);
        for (ComparableStudent student : studentList2) {
            System.out.println(student);
        }
    }
}
