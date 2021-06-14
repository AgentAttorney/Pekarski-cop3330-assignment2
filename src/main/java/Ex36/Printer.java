package Ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Printer {
    public void print(double min_print, double max_print,
                      double avg_print, double standDev_print,
                      ArrayList<Double> numbers) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The numbers are: " + numbers); // It doesn't match the format but its nice
        System.out.println("The min is: "+ min_print);
        System.out.println("The max is: "+ max_print);
        System.out.println("The avg is: " + avg_print);
        System.out.println("The standard deviation is: " + df.format(standDev_print));
    }
}
