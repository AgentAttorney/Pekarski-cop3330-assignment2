package Ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Scanner;

public class scanInput {
    Scanner input = new Scanner(System.in);
    public int numEmployee()
    {
        return input.nextInt();
    }

    public String Name() {
        return input.nextLine();
    }
}
