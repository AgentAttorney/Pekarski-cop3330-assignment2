package Ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example31 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Human Human_1 = new Human();
        String test_result = "";
        System.out.println("Enter Resting HR and age. ");
        while(true)
        {
            try
            {
                Human_1.setHR(input.nextDouble());
                Human_1.setAge(input.nextInt()); // maybe should check if positive
                test_result = Human_1.Exercise();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input for at least 1 value. Enter again.");
                input.nextLine(); // No infinite loop
            }
        }
       // System.out.println(test_result);
    }
}
