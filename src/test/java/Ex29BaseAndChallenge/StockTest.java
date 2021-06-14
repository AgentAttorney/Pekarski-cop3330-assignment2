package Ex29BaseAndChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void calculateStock_Example_Case() {
        Stock newStock = new Stock();
        newStock.setRate(4);
        int years = newStock.CalculateStock();
        assertEquals(18,years);
    }
    @Test
    void calculateStock_Int_Division_Round() {
        Stock newStock = new Stock();
        newStock.setRate(5);
        int years = newStock.CalculateStock();
        assertEquals(15,years);
    }
    @Test
    void calculateStock_Int_1() {
        Stock newStock = new Stock();
        newStock.setRate(1);
        int years = newStock.CalculateStock();
        assertEquals(72,years);
    }
    @Test
    void calculateStock_Int_72() {
        Stock newStock = new Stock();
        newStock.setRate(72);
        int years = newStock.CalculateStock();
        assertEquals(1,years);
    }
    @Test
    void calculateStock_Int_round_up_72() {
        Stock newStock = new Stock();
        newStock.setRate(73);
        int years = newStock.CalculateStock();
        assertEquals(1,years);
    }
}