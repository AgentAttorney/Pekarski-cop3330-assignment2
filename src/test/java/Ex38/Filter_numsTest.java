package Ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Filter_numsTest {

    @Test
    void filterEvenNumbers_0_to_10() {
        Filter_nums Fn = new Filter_nums();
        List<String> array_list_nums = new ArrayList<String>();
        List<String> array_list_given = new ArrayList<>();
        for(int i=0,index=0;i<5;i++,index+=2)
        {
            array_list_given.add(String.valueOf(index));
        }
        for(int i=0;i<10;i++)
        {
            array_list_nums.add(String.valueOf(i));
        }
        array_list_nums = Fn.filterEvenNumbers(array_list_nums);
        assertEquals(array_list_given,array_list_nums);
    }
    @Test
    void filterEvenNumbers_100_to_1000() {
        Filter_nums Fn = new Filter_nums();
        List<String> array_list_nums = new ArrayList<String>();
        List<String> array_list_given = new ArrayList<>();
        for(int i=0,index=100;i<450;i++,index+=2)
        {
            array_list_given.add(String.valueOf(index));
        }
        for(int i=100;i<1000;i++)
        {
            array_list_nums.add(String.valueOf(i));
        }
        array_list_nums = Fn.filterEvenNumbers(array_list_nums);
        assertEquals(array_list_given,array_list_nums);
    }
}