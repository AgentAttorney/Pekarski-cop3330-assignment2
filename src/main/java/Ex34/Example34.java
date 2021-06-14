package Ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.ArrayList;
import java.util.List;

public class Example34 {
    public static void main(String[] args) {
        scanInput input = new scanInput(); // class which will do all scans
        employList Employees = new employList();
        System.out.println("How many employees? ");
        int num_employ = input.numEmployee();
        System.out.println("For " + num_employ + " employees, enter their names.");
        for (int i = 0; i <= num_employ; i++) {
            String toList = input.Name();
            Employees.addName(toList);
        }
        List<String> print_employees = new ArrayList<String>();
        print_employees = Employees.printList();
        for (String item : print_employees) {
            System.out.println(item);
        }
        System.out.println("Enter an employee name to remove.");
        String toRemove = input.Name();
        Employees.removeName(toRemove);
        print_employees = Employees.printList();
        for (String item : print_employees) {
            System.out.println(item);
        }
    }
}
