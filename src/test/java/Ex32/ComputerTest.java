package Ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
        // FINALLY; HAD TO REDESIGN LIKE ONE OF THE HARDEST ONES TO CODE :((((((
    @Test
    void Difficulty_1() {
        Computer AI = new Computer();
        User user_1 = new User();
        AI.setDifficulty(1);
        int num_guesses = 0,index=0;
        int com_guess = AI.numRange();
        while(true) {
            AI.guessingGame(index, com_guess, num_guesses);
            index++;
            num_guesses += user_1.incrementGuess();
            if(com_guess==index) {
                break;
            }
        }
        assertEquals(com_guess, index);
    }
    @Test
    void Difficulty_2(){
        Computer AI = new Computer();
        User user_1 = new User();
        AI.setDifficulty(2);
        int num_guesses = 0,index=0;
        int com_guess = AI.numRange();
        while(true) {
            AI.guessingGame(index, com_guess, num_guesses);
            index++;
            num_guesses += user_1.incrementGuess();
            if(com_guess==index) {
                break;
            }
        }
        assertEquals(com_guess, index);
    }
    @Test
    void Difficulty_3(){
        Computer AI = new Computer();
        User user_1 = new User();
        AI.setDifficulty(3);
        int num_guesses = 0,index=0;
        int com_guess = AI.numRange();
        while(true) {
            AI.guessingGame(index, com_guess, num_guesses);
            index++;
            num_guesses += user_1.incrementGuess();
            if(com_guess==index) {
                break;
            }
        }
        assertEquals(com_guess, index);
    }
}