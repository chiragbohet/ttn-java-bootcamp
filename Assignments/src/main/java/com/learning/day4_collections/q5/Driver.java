package main.java.com.learning.day4_collections.q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Q5. Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name}

public class Driver {

    public static void main(String[] args) {

        //Creating a list of Employees
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Chirag", 24.0, 200.0));
        employeeList.add(new Employee("Ajay", 24.0, 100.0));
        employeeList.add(new Employee("Rahul", 24.0, 300.0));


        System.out.println("Before sorting : ");
        for (Employee e : employeeList)
            System.out.println(e.toString());

        //Passing custom Comparator as the second argument of sort method.
        Collections.sort(employeeList, new sortEmployeeBySalary());

        System.out.println("After sorting : ");
        for (Employee e : employeeList)
            System.out.println(e.toString());


    }
}
