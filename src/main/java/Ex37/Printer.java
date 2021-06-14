package Ex37;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Printer {
    public void RandomPassword(List<Character> password) {
        System.out.print("Your password is: ");
        Random rand = new Random();
        Collections.shuffle(password);
        for(int i=0;i<password.size();i++)
        {
            System.out.print(password.get(i));
        }
    }
}
