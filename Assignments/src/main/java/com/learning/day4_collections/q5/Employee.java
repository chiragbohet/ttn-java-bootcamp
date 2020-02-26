package main.java.com.learning.day4_collections.q5;

import java.util.Comparator;

/*
* A simple Employee class made as per question requirements
* Containing required fields - name, age and salary.
* */
public class Employee {

    public String name;
    public double age;
    public double salary;

    public Employee(String name, double age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class sortEmployeeBySalary implements Comparator<Employee> {

    //Overriding compare method to compare on Employee salaries.
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.salary > e2.salary)
            return 1;
        else if (e1.salary < e2.salary)
            return -1;
        else
            return 0;
    }
}
