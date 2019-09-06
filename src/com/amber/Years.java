package com.amber;

import java.util.Scanner;

public class Years {
    private int months;

    // Constructor  -- not really needed because the scanner is happening here
    public Years(int months) {
        this.months = months;
    }

    public int askYears() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("How many years would you like to finance?");
            int years = scan.nextInt();
            this.months = years * 12;
            if(years > 10 && years < 51) break;
            System.out.println("Please choose between 10 - 50 years.");
        }
        return months;
    }


// GET
    public int getMonths() {
        return  months;
    }

}