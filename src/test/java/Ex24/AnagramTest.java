package Ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram_Common_Case_True() {
        Anagram ag = new Anagram();
        ag.setWords("tone","note");
        boolean actual = ag.isAnagram();
        assertEquals(true,actual);
    }
    @Test
    void isAnagram_uncommon_Case_False() {
        Anagram ag = new Anagram();
        ag.setWords("hollander","juan");
        boolean actual = ag.isAnagram();
        assertEquals(false, actual);
    }
    @Test
    void isAnagram_uncommon_Case_True() {
        Anagram ag = new Anagram();
        ag.setWords("soundvoltex","voltsoundex");
        boolean actual = ag.isAnagram();
        assertEquals(true, actual);
    }
    @Test
    void isAnagram_one_letter_Case_True() {
        Anagram ag = new Anagram();
        ag.setWords("e","e");
        boolean actual = ag.isAnagram();
        assertEquals(true, actual);
    }
    @Test
    void isAnagram_one_letter_Case_False() {
        Anagram ag = new Anagram();
        ag.setWords("a","e");
        boolean actual = ag.isAnagram();
        assertEquals(false, actual);
    }
}