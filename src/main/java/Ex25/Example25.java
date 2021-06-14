package Ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Scanner;

public class Example25 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        User User_1 = new User();
        Strength User_1a = new Strength();

        System.out.print("Enter a password. ");
        User_1.setPassword(input.nextLine());
        int strength = User_1.strengthPassword(User_1.getPassword());

        User_1a.setStrength(strength);
        User_1a.convertStrength();
    }
}
