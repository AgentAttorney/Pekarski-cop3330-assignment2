package Ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class CreditCard{
    private double APR,balance,payment;
    PaymentCalculator fin_months = new PaymentCalculator();

    public void setAPR(double APR) {
        this.APR = (APR / 365.0) / 100.0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMP(double payment) {
        this.payment = payment;
    }
    public void activate_Calculator()
    {
        int months_to_pay = fin_months.calculateMonthsUntilPaidOff(APR, balance, payment);
        System.out.print(months_to_pay);
    }
}
