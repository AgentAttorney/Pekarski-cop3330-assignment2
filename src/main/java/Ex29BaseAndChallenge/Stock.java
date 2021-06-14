package Ex29BaseAndChallenge;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Stock {
    private double rate;
    private double year_month;
    private int years;
    public void setRate(double rate_return) {
        this.rate = rate_return;
    }

    public int CalculateStock(){
        this.year_month =  72 / rate;
        this.years = (int) Math.ceil(year_month);
        return years;
    }
}
