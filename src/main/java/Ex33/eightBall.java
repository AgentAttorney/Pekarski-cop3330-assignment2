package Ex33;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class eightBall {
    private int index;
    public void getRandIndex()
    {
        Random rand = new Random();
        index = rand.nextInt(4); // 0-3
        String answer = applyIndex(index);
    }
    public String applyIndex(int index)
    {
        String[] options = {"Yes.","No.","Maybe","Ask again later."};
        List<String> options_list=new ArrayList<String>();
        for(String lang:options){
            options_list.add(lang);
        }
        String answer = options_list.get(index);
        return answer;
    }
    public void operateBall()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your question? ");
        String question = input.nextLine();
        getRandIndex();
    }
}
