package Ex28.Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Adder {
    private int sum;
    public int add_numbers(int add)
    {
        sum += add;
        return sum;
    }
    public String getSum()
    {
        String result = String.valueOf(sum);
        return result;
    }
}
