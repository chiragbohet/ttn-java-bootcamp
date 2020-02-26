package main.java.com.learning.day4_collections.q6;

import java.util.Comparator;

/*
* Simple Student class made as per question requirements
* Containing required fields name, age and score
* */
public class Student {
    private String name;
    private double Age;
    private double score;

    public Student(String name, double age, double score) {
        this.name = name;
        this.Age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return Age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", score=" + score +
                '}';
    }
}

class compareStudentFirstOnScoreThenOnName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        //first compare on score
        if(s1.getScore() > s2.getScore())
            return 1;
        else if(s1.getScore() < s2.getScore())
            return -1;
        else
        {   //if score same then compare on name
            return s1.getName().compareTo(s2.getName());
        }

    }
}
