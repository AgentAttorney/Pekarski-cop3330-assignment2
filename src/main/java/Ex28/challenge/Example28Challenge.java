package Ex28.challenge;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example28Challenge {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int length_loop;
        int sum=0;
        System.out .println("How many numbers to enter? ");
        length_loop = input.nextInt(); // or enter as String and use parseInt
        List<Integer> ints = new ArrayList<Integer>(length_loop);
        System.out.println("Enter " + length_loop + " numbers. ");
        for(int i=0;i<length_loop;i++)
        {
             ints.add(input.nextInt());
             sum += ints.get(i);
        }
        System.out.print(sum);

    }
}
