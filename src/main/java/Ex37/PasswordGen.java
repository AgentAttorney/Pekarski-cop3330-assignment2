package Ex37;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGen {
    private int length,special,numbers;
    public void setLength(int length) {
        this.length = length;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public void createList() {
        {
            int REDIX=10; // decimal base
            List<Character> password = new ArrayList<>();
            Random r = new Random();
            Printer print_password = new Printer();
            for(int i=0;i<special;i++)
            {
                // random not digit, char, or space
                String special_char = (String.valueOf((char)(r.nextInt(95)+32)));
                char convert_special_char = special_char.charAt(0); // feels cheeky lol
                while(true)
                {
                    if(!(Character.isDigit(convert_special_char) || Character.isAlphabetic(convert_special_char)
                    || Character.isSpaceChar(convert_special_char)))
                    {
                        break;
                    }
                    else
                    {
                         special_char = (String.valueOf((char)(r.nextInt(95)+32)));
                         convert_special_char = special_char.charAt(0); // feels cheeky lol
                    }
                }
                password.add(convert_special_char);
            }
            for(int i=0;i<numbers;i++)
            {
                // random digit
                int digit =  r.nextInt(10);
                char convert_digit = Character.forDigit(digit,REDIX); // wasn't converting properly
                password.add(convert_digit);
            }
            // real minimum amount of characters is numbers*special
            for(int i=0;i<(length - numbers*special);i++)
            {
                int random_alpha = r.nextInt(52); // 52 alphabetic characters
                char alpha_case = (random_alpha < 26) ? 'A' : 'a'; // determines lower or upper case
                password.add((char) (alpha_case + random_alpha % 26)); // converts it to char and adds
            }
        print_password.RandomPassword(password);

        }
    }
}
