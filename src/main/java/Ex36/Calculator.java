package Ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.ArrayList;

public class Calculator {
    private double milliseconds,min_print,max_print,avg_print,standDev_print;
    private int size;
    ArrayList<Double> numbers = new ArrayList<Double>();
    Printer printMethods = new Printer();
    public void setMilliseconds(double milliseconds)
    {
        this.milliseconds = milliseconds;
        numbers.add(this.milliseconds);

    }
    public void performMethods()
    {
        this.size = numbers.size();
        this.min_print = min(numbers,size);
        this.max_print = max(numbers,size);
        this.avg_print = avg(numbers,size);
        this.standDev_print = std(numbers,size,this.avg_print);
        printMethods.print(this.min_print,this.max_print,this.avg_print,this.standDev_print,numbers);
    }

    public double std(ArrayList<Double> numbers,int size,double avg_print) {
        double stand_dev = 0;
        for(int i=0;i<size;i++)
        {
            stand_dev += Math.pow((numbers.get(i)-avg_print),2);
        }
        double sq = stand_dev / size;
        double result = Math.sqrt(sq);
        return result;
    }

    public double avg(ArrayList<Double> numbers, int size) {
        double sum=0;
        for(int i = 0;i<size;i++)
        {
            sum += numbers.get(i);
        }
        return sum / size;
    }

    public double max(ArrayList<Double> numbers, int size) {
        double max = numbers.get(0);
        for(int i = 1;i < size;i++)
        {
            if(numbers.get(i) > max)
                max = numbers.get(i);
        }
        return max;
    }

    public double min(ArrayList<Double> numbers, int size) {
        double min = numbers.get(0);
        for(int i = 1;i < size;i++)
        {
            if(numbers.get(i) < min)
                min = numbers.get(i);
        }
        return min;
    }
}
