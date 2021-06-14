package Ex26;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example26 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CreditCard Person = new CreditCard();
        System.out.println("Enter the APR %,the account balance, and planned monthly payment. ");
        Person.setAPR(input.nextDouble());
        Person.setBalance(input.nextDouble());
        Person.setMP(input.nextDouble());
        Person.activate_Calculator();
    }
}
