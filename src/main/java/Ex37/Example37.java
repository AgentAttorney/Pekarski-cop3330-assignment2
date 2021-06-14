package Ex37;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example37 {
    public static void main(String[] args)
    {
        PasswordGen user_password = new PasswordGen();
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try{
                System.out.println("Enter minimum length, number of special characters, and number of numbers.");
                user_password.setLength(input.nextInt());
                user_password.setSpecial(input.nextInt());
                user_password.setNumbers(input.nextInt());
                user_password.createList();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Enter integers please.");
                input.nextLine();
            }
        }
    }
}
