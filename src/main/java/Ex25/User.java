package Ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class User{
    private String password;
    public void setPassword(String password)
    {
        this.password = password;
    }
    public int strengthPassword(String password)
    {
        int strength;
        int length = password.length();
        char[] convert_password = password.toCharArray();
        if(length < 8)
        {
            for(int i=0;i<length;i++)
            {
                if(Character.isWhitespace(convert_password[i]))
                {
                    throw new IllegalArgumentException("No spaces in passwords. ");
                }

                if(Character.isAlphabetic(convert_password[i])) {
                    strength = 2;
                    return strength;
                }
            }
            strength = 1;
        }
        else
        {
            int digit_count=0;
            int char_count = 0;
            int special_chars = 0;
            for(int i=0;i<length;i++)
            {
                if(Character.isWhitespace(convert_password[i]))
                {
                    throw new IllegalArgumentException("No spaces in passwords. ");
                }

                if(!Character.isAlphabetic(convert_password[i])
                        && !Character.isDigit(convert_password[i]))
                {
                    special_chars += 1;
                }
                if(Character.isAlphabetic(convert_password[i]))
                {
                    char_count += 1;
                }
                if(Character.isDigit(convert_password[i]))
                {
                    digit_count += 1;
                }
                if(special_chars > 0 && digit_count > 0 && char_count > 0)
                {
                    strength = 5;
                    return strength;
                }
            }
            if(digit_count == 0 || char_count == 0)
            {
                strength = 3;
                return strength;
            }
            strength = 4;
        }
        return strength;
    }
    public String getPassword() {
        return password;
    }
}
