package Ex33;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class eightBallTest {
    // We only need one test really?
    @Test
    void applyIndex() {
        eightBall conchShell = new eightBall();
        String possible_responses[] = {"Yes.","No.","Maybe","Ask again later."};
        Random rand = new Random();
        int index = rand.nextInt(4);
        String actualAnswer = conchShell.applyIndex(index);
        List<String> possible_responses_list = Arrays.asList(actualAnswer);
        assertEquals(true,possible_responses_list.contains(actualAnswer));
    }
}