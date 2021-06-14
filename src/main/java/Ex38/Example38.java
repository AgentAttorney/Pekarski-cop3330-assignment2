package Ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.*;

public class Example38 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Filter_nums evens = new Filter_nums();
        String list_nums = input.nextLine();
        String[] arrOfStr = list_nums.split(" ", -1);
        List<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,arrOfStr);
        evens.filterEvenNumbers(arrayList);
        System.out.print("The even numbers are: " + arrayList);
    }
}
