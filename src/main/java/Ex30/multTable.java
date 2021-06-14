package Ex30;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class multTable {

    public String setValues() {
        String sum = "";
        for(int row = 1; row <= 12; row++) {
            for (int col = 1; col <= 12; col++) {
                if (row == 1 || col == 1) {
                    if (col == 1 && row != 1) {
                        System.out.printf("%4d",row);
                        sum = sum + row;
                    } else
                    {
                        System.out.printf("%4d",col);
                        sum = sum + col;
                    }
                } else
                {
                    int number = col*row;
                    System.out.printf("%4d",number);
                    sum = sum + number;
                }
            }
            System.out.println();
            sum = sum + "\n";
        }
        return sum;
    }
}
