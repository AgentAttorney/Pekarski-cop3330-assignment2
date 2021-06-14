package Ex28.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    @Test
    void getSum_use_i() {
        Adder Add = new Adder();
        for(int i=0;i<5;i++)
        {
            Add.add_numbers(i);
        }
        String sum = Add.getSum();
        assertEquals("10",sum);
    }
    @Test
    void getSum_use_i_plus_1() {
        Adder Add = new Adder();
        for(int i=0;i<5;i++)
        {
            Add.add_numbers(i+1);
        }
        String sum = Add.getSum();
        assertEquals("15",sum);
    }
    @Test
    void getSum_use_i_times_3() {
        Adder Add = new Adder();
        for(int i=0;i<5;i++)
        {
            Add.add_numbers(i*3);
        }
        String sum = Add.getSum();
        assertEquals("30",sum);
    }
    @Test
    void getSum_adding_0() {
        Adder Add = new Adder();
        for(int i=0;i<5;i++)
        {
            Add.add_numbers(0);
        }
        String sum = Add.getSum();
        assertEquals("0",sum);
    }
    @Test
    void getSum_use_i_minus_1() {
        Adder Add = new Adder();
        for(int i=0;i<5;i++)
        {
            Add.add_numbers(i-10);
        }
        String sum = Add.getSum();
        assertEquals("-40",sum);
    }
}