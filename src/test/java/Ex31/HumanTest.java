package Ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void exercise_HR50_Age100_Built_Different() {
        Human newHuman = new Human();
        newHuman.setAge(100);
        newHuman.setHR(50);
        String numbers = newHuman.Exercise();
        assertEquals("55 89\n" +
                "60 92\n" +
                "65 96\n" +
                "70 99\n" +
                "75 103\n" +
                "80 106\n" +
                "85 110\n" +
                "90 113\n" +
                "95 117\n",numbers);
    }
    @Test
    void exercise_HR50_Age100_Test_Example() {
        Human newHuman = new Human();
        newHuman.setAge(22);
        newHuman.setHR(65);
        String numbers = newHuman.Exercise();
        assertEquals("55 138\n" +
                "60 145\n" +
                "65 151\n" +
                "70 158\n" +
                "75 165\n" +
                "80 171\n" +
                "85 178\n" +
                "90 185\n" +
                "95 191\n",numbers);
    }
    @Test
    void exercise_HR0_Age10_Test_Example() {
        Human newHuman = new Human();
        newHuman.setAge(10);
        newHuman.setHR(0);
        String numbers = newHuman.Exercise();
        assertEquals("55 116\n" +
                "60 126\n" +
                "65 137\n" +
                "70 147\n" +
                "75 158\n" +
                "80 168\n" +
                "85 179\n" +
                "90 189\n" +
                "95 200\n",numbers);
    }
    @Test
    void exercise_HR150_Age30_Test_Example() {
        Human newHuman = new Human();
        newHuman.setAge(30);
        newHuman.setHR(150);
        String numbers = newHuman.Exercise();
        assertEquals("55 172\n" +
                "60 174\n" +
                "65 176\n" +
                "70 178\n" +
                "75 180\n" +
                "80 182\n" +
                "85 184\n" +
                "90 186\n" +
                "95 188\n",numbers);
    }
}