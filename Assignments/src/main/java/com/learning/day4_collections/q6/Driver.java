package main.java.com.learning.day4_collections.q6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        //Creating a list of Students
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Harsh", 24, 80));
        studentList.add(new Student("Chirag", 24, 60));
        studentList.add(new Student("Apoorva", 20, 80));
        studentList.add(new Student("Ajay", 24, 70));

        System.out.println("Before sorting...");
        for (Student s : studentList)
            System.out.println(s.toString());

        //Passing custom Comparator as argument
        Collections.sort(studentList, new compareStudentFirstOnScoreThenOnName());

        System.out.println("After sorting...");
        for (Student s : studentList)
            System.out.println(s.toString());

    }
}
