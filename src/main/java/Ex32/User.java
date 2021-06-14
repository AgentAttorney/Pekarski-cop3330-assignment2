package Ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    Scanner input = new Scanner(System.in);
    private int num_guesses;
            public int guess;
    public int getGuess() {
        int guess;
        while(true)
        {
            try{
                guess = input.nextInt();
                return guess;
            }
            catch(InputMismatchException e)
            {
                incrementGuess();
                System.out.print("Wrong type of guess. Guess again. ");
                input.nextLine();
            }
        }
    }
    public int incrementGuess() {
        this.num_guesses++;
        return num_guesses;
    }

    public int startGuesses(int com_guess, int user_guess) {
        if (user_guess < com_guess) {
            System.out.print("Too low. Guess again: ");
            num_guesses = incrementGuess();
            return num_guesses;
        } else if (user_guess > com_guess) {
            System.out.print("Too high. Guess again: ");
            num_guesses = incrementGuess();
            return num_guesses;
        } else {
            num_guesses = incrementGuess();
            return num_guesses;
        }
    }
}
