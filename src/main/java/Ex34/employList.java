package Ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.ArrayList;
import java.util.List;

public class employList{
    List<String> Employee_List = new ArrayList<String>();
    public void addName(String name)
    {
        Employee_List.add(name);
    }

    public void removeName(String toRemove) {
        Employee_List.remove(toRemove);
    }
    public List<String> printList()
    {
        System.out.print("The employees are: ");
        return Employee_List;

    }
}
