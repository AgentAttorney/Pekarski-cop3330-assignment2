package Ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
 // Discrepancies when balance gets high usually. Having issues doing manual computation
 // Website numbers don't always match up, rounding??
class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_Example_Given() {
        PaymentCalculator payment = new PaymentCalculator();
        double APR = (12/100.0) / 365.0;
        int months = payment.calculateMonthsUntilPaidOff(APR,5000,100);
        assertEquals(70,months);
    }
    @Test
    void calculateMonthsUntilPaidOff_High_Balance_Low_APR() {
        PaymentCalculator payment = new PaymentCalculator();
        double APR = (1/100.0) / 365.0;
        int months = payment.calculateMonthsUntilPaidOff(APR,10000,100);
        assertEquals(105,months);
    }
    @Test
    void calculateMonthsUntilPaidOff_High_APR_Small_Balance() {
        PaymentCalculator payment = new PaymentCalculator();
        double APR = (50/100.0) / 365.0;
        int months = payment.calculateMonthsUntilPaidOff(APR,1000,500);
        assertEquals(3,months);
    }
     @Test
     void calculateMonthsUntilPaidOff_Higher_Balance_Low_APR() {
         PaymentCalculator payment = new PaymentCalculator();
         double APR = (5/100.0) / 365.0;
         int months = payment.calculateMonthsUntilPaidOff(APR,100000,1000);
         assertEquals(130,months);
     }
}