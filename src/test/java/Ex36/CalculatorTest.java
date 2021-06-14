package Ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;

class CalculatorTest {

    @Test
    void min_0_to_4() {
        Calculator myCalc = new Calculator();
        ArrayList<Double> numbers = new ArrayList<Double>();
        for(int i=0;i<5;i++)
        {
            numbers.add((double) i);
        }
        double min = myCalc.min(numbers,numbers.size());
        assertEquals(0,min,.00001);
    }
    @Test
    void min_i_exponent_i_plus_1() {
        Calculator myCalc = new Calculator();
        ArrayList<Double> numbers = new ArrayList<Double>();
        for(int i=0;i<5;i++)
        {
            numbers.add((double) Math.pow(i,i+1));
        }
        double min = myCalc.min(numbers,numbers.size());
        assertEquals(0,min,.000001);
    }
    @Test
    void avg_0_to_4() {
        Calculator myCalc = new Calculator();
        ArrayList<Double> numbers = new ArrayList<Double>();
        for(int i=0;i<5;i++)
        {
            numbers.add((double) i);
        }
        double avg = myCalc.avg(numbers,numbers.size());
        assertEquals(2,avg,.00001);
    }
    @Test
    void avg_i_exponent_i_plus_1() {
        Calculator myCalc = new Calculator();
        ArrayList<Double> numbers = new ArrayList<Double>();
        for(int i=0;i<5;i++)
        {
            numbers.add((double) Math.pow(i,i+1));
        }
        double avg = myCalc.avg(numbers,numbers.size());
        assertEquals(222.8,avg,.000001);
    }

    @Test
    void max_0_to_4() {
        Calculator myCalc = new Calculator();
        ArrayList<Double> numbers = new ArrayList<Double>();
        for(int i=0;i<5;i++)
        {
            numbers.add((double) i);
        }
        double max = myCalc.max(numbers,numbers.size());
        assertEquals(4,max,.00001);
    }
    @Test
    void max_i_exponent_i_plus_1() {
        Calculator myCalc = new Calculator();
        ArrayList<Double> numbers = new ArrayList<Double>();
        for(int i=0;i<5;i++)
        {
            numbers.add((double) Math.pow(i,i+1));
        }
        double max = myCalc.max(numbers,numbers.size());
        assertEquals(1024,max,.000001);
    }

    @Test
    void std_0_to_4() {
        Calculator myCalc = new Calculator();
        ArrayList<Double> numbers = new ArrayList<Double>();
        for(int i=0;i<5;i++)
        {
            numbers.add((double) i);
        }
        double avg = myCalc.avg(numbers,numbers.size());
        double std = myCalc.std(numbers,numbers.size(),avg);
        assertEquals(1.4142135623731,std,.000001);
    }
    @Test
    void std_i_exponent_i_plus_1() {
        Calculator myCalc = new Calculator();
        ArrayList<Double> numbers = new ArrayList<Double>();
        for(int i=0;i<5;i++)
        {
            numbers.add((double) Math.pow(i,i+1));
        }
        double avg = myCalc.avg(numbers,numbers.size());
        double std = myCalc.std(numbers,numbers.size(),avg);
        assertEquals(401.746885488861,std,.000001);
    }
}