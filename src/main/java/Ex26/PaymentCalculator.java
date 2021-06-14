package Ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class PaymentCalculator {
    public int calculateMonthsUntilPaidOff(double APR,double balance, double payment) {
        int num_months;
        double intermediate = Math.pow(1+APR,30);
        double calculation = ((-1.0/30) * Math.log10(1 + (balance / payment)*(1-intermediate))) / Math.log10(1+APR);
        num_months = (int) Math.ceil(calculation); // Math.ceil might not be the right method
        return num_months;
    }
}
