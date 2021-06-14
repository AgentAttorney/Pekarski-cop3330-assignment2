package Ex28.Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Scanner;

public class Example28 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 5 numbers. ");
        Adder Add = new Adder();

        for(int i=0;i<5;i++)
        {
            sum = Add.add_numbers(input.nextInt());

        }
        System.out.print(Add.getSum());
    }
}
