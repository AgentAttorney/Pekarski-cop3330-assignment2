package Ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Random;

public class Computer {
    private int difficulty,com_guess;
    User User_1 = new User();
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int numRange() {
        Random rand = new Random();
        //User User_1 = new User();
        int difficulty = getDifficulty();
        int com_guess, user_guess, num_guesses = 0;
        System.out.println("I have my difficulty. Guess the number.");
        if (difficulty == 1) {
            com_guess = rand.nextInt(11);
        } else if (difficulty == 2) {
            com_guess = rand.nextInt(101);
        } else // I got rid of the 'if' part here so that intelliJ would stop bugging me
        {
            com_guess = rand.nextInt(1001);
        }
        return com_guess;
    }

    public int guessingGame(int user_guess,int com_guess,int num_guesses) {
        //User User_1 = new User();
        if (user_guess < com_guess) {
            System.out.print("Too low. Guess again: ");
            num_guesses = User_1.incrementGuess();
        } else if (user_guess > com_guess) {
            System.out.print("Too high. Guess again: ");
            num_guesses = User_1.incrementGuess();
        } else {
            num_guesses = User_1.incrementGuess();
        }
        return num_guesses;
    }
}


