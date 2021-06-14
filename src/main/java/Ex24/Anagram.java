package Ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Arrays;

public class Anagram {
    private String word_1,word_2;
    public void setWords(String word_1,String word_2) {
        this.word_1 = word_1;
        this.word_2 = word_2;
    }

    public boolean isAnagram() {
        if(word_1.length() != word_2.length())
        {
            return false;
        }
        else
        {
            // Arrays.sort() works for arrays, but not for strings
            // Since strings are char[] arrays / pointers, I'll just convert

            char[] chars_word1 = word_1.toCharArray();
            char[] chars_word2 = word_2.toCharArray();

            Arrays.sort(chars_word1);
            Arrays.sort(chars_word2);
            if(Arrays.equals(chars_word1,chars_word2))
            {
                return true;
            }
            return false;
        }
    }
}
