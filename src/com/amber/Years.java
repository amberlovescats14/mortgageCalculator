package com.amber;

import java.util.Scanner;

public class Years {
    public static int askYears() {
        Scanner scan = new Scanner(System.in);
        int months;
        while(true) {
            System.out.print("How many years would you like to finance?");
            int years = scan.nextInt();
            months = years * 12;
            if(years > 10 && years < 51) break;
            System.out.println("Please choose between 10 - 50 years.");
        }
        return months;
    }
}
