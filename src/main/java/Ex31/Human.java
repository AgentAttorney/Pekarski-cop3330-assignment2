package Ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Human {
    private double HR;
    private int age;
    public void setHR(double HR) {
        this.HR = HR;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String Exercise() {
        double Karvonen_HR;
        String test_result = "";
        System.out.println("Resting HR: " + HR + "\t\tAge: " + age);
        System.out.println();
        System.out.println("Intensity\t | Rate");
        System.out.println("-------------|--------");
        for(int percent = 55;percent<=95;percent+=5)
        {
            double intensity = percent / 100.0;
            Karvonen_HR = (((220 - age)-HR)*intensity)+HR;
            int Karvonen_HR_round = (int) ((double) Math.round(Karvonen_HR));
            test_result = test_result + percent + " " + Karvonen_HR_round + "\n";
            System.out.println(percent + "%\t\t\t | " + Karvonen_HR_round + "bpm");
        }
        return test_result;
    }
}
