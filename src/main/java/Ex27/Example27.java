package Ex27;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example27 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Employee new_Employee = new Employee();
        System.out.println("Enter a first name, last name, ID and Zip Code");
        new_Employee.ValidateInput(input.next(),input.next(),
                input.next(),input.next());
    }
}
