package Ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class employListTest {

    @Test
    void printList_Five_Names() {
        employList eL = new employList();
        String[] test_case_inputs = {"Abby","Jon","Jack","Zach","Christine"};
        List<String> test_case = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            test_case.add(test_case_inputs[i]);
        }
        List<String> user_input = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            eL.addName(test_case_inputs[i]);
        }
        user_input = eL.printList();
        assertEquals(test_case,user_input);
    }
}