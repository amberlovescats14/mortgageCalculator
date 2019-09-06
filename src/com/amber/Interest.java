package com.amber;

import java.util.Scanner;

public class Interest {
    public static double askInterest(){
        Scanner scan = new Scanner(System.in);
        double monthlyInterest;
        while(true){
            System.out.print("Annual Interest?");
            monthlyInterest = (scan.nextDouble() / 100) /12;
            if(monthlyInterest > 0 && monthlyInterest < 10) break;
            System.out.println("Please enter a rate between .1 - 10");
        }
        return  monthlyInterest;
    }
}
