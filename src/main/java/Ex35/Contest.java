package Ex35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Contest {
    private int index;
    public void setRandIndex(int names) {
        Random rand = new Random();
        int randIndex = rand.nextInt(names);
        this.index = randIndex;
    }
    public String makeAL()
    {
        Scanner input = new Scanner(System.in);
        List<String> entries =new ArrayList<String>();
        int names = 0;
        while(true)
        {
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            if((name.isEmpty()))
            {
                break;
            }
            else
            {
                entries.add(name);
                names++;
            }
        }
        setRandIndex(names);
        System.out.print(entries.get(this.index) + " is the winner!");
        return entries.get(this.index);
    }
}
