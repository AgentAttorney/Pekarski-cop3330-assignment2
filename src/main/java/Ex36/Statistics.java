package Ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Scanner;

public class Statistics {
    Scanner input = new Scanner(System.in);
    Calculator operations = new Calculator();
    private String curr_entry;
    public void isValid()
    {
        while(true)
        {
            try
            {
                System.out.print("Enter a response time: ");
                curr_entry = setString();
                if(curr_entry.equals("done"))
                {
                    break;
                }
                double milliseconds = Double.parseDouble(curr_entry);
                operations.setMilliseconds(milliseconds);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Not valid input. Enter again.");
                input.nextLine();
            }
        }
         operations.performMethods();

    }
    public String setString()
    {
        String curr_entry = input.next();
        return curr_entry;
    }
}
