package Ex29BaseAndChallenge;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.InputMismatchException;
import java.util.Scanner;

// This was going to be just the base, but I did the challenge without even realizing

public class Example29 {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            Stock myStock = new Stock();
            double rate_return;
            boolean valid = true;
            while (valid) {
                System.out.println("Enter a rate of return for the stonk. ");
                try {
                    rate_return = input.nextDouble();
                    int check_division = 72 / ((int) rate_return); // this feels cheap

                    myStock.setRate(rate_return);
                    break;

                } catch (ArithmeticException ae) {
                    System.out.println("Cannot divide by 0. Enter again .");
                    input.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Input invalid. Enter again. ");
                    input.nextLine(); // Without this, the error message was infinite looping
                }
            }
            System.out.print(myStock.CalculateStock() + " years.");
        }
    }
}
