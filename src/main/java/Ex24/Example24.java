package Ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */
import java.util.Scanner;

public class Example24 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Anagram Anagram_1 = new Anagram();
        System.out.println("Enter two words. I'll tell if the two are anagrams. ");
        String word_1 = input.next();
        String word_2 = input.next();

        Anagram_1.setWords(word_1,word_2);

        boolean isAnagram = Anagram_1.isAnagram();
        System.out.print(isAnagram);
    }
}
