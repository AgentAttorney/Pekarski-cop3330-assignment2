package Ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Strength {
    private int strength;
    public void setStrength(int strength)
    {
        this.strength = strength;
    }
    public void convertStrength()
        {
            String statement;
            switch(strength)
            {
                case 2:
                    statement = "Your password is weak.";
                    break;
                case 3:
                    statement = "Your password is mediocre.";
                    break;
                case 4:
                    statement ="Your password is strong.";
                    break;
                case 5:
                    statement ="Your password is very strong.";
                    break;
                default:
                    statement = "Your password is very weak.";
                    break;
            }
            System.out.print(statement);
        }
}
