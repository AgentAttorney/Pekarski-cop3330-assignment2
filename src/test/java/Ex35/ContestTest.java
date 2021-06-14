package Ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ContestTest {

    @Test
    void makeAL() {
        Contest Drawing = new Contest();
        String Winner = Drawing.makeAL();
        assertEquals(true,true);
    }
}