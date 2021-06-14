package Ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example32 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Computer AI = new Computer();
        User User_1 = new User();

        System.out.print("Enter the difficulty level. ");
        AI.setDifficulty(input.nextInt()); // Didn't want to make custom exception for this
        int com_guess = AI.numRange();
        int num_guesses=0;

            while(true) {
                try {
                    int user_guess = input.nextInt();
                    num_guesses = User_1.startGuesses(com_guess, user_guess);
                     if(com_guess == user_guess)
                     {
                         System.out.print("You got it in " + num_guesses + " tries.");
                         break;
                     }
                } catch (InputMismatchException e) {
                    User_1.incrementGuess();
                    System.out.print("Wrong type of guess. Guess again. ");
                    input.nextLine();
                }
            }
    }
}
