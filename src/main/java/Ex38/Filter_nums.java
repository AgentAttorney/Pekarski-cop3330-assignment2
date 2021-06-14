package Ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.List;

public class Filter_nums {
    public List<String> filterEvenNumbers(List<String> array_list_nums)
    {
        for(int i = 0;i < array_list_nums.size(); i++){
            int b = Integer.parseInt(array_list_nums.get(i));
            if(b % 2 == 1)
                array_list_nums.remove(i);
        }
        return array_list_nums;
    }
}
