package com.amber;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       String message =  greetUser("Amber", "Jones");
        System.out.println(message);

        int principal = askPrincipal();
        double monthlyInterest =  askInterest();
        int months = askYears();
        String mortgage = calculateMortgage(principal, monthlyInterest, months);
        System.out.println("Average monthly payment: " + mortgage);


    }
    //OUTSIDE THE MAIN
    public static String greetUser(String firstName, String lastName){
       return "Hello " + firstName + " " + lastName;
    }
    public static int askPrincipal(){
        Scanner scan = new Scanner(System.in);
        int principal;
        while(true){
            System.out.print("Principal amount?");
            principal = scan.nextInt();
            if(principal > 1000 && principal < 1000000) break;
            System.out.println("Please enter an amount between 1K - 1M");
        }
        return principal;
    }

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

    public static String calculateMortgage(
            int principal,
            double monthlyInterest,
            int months
    ) {
        double top = monthlyInterest * Math.pow(1 + monthlyInterest, months);
        double bottom = Math.pow(1 + monthlyInterest, months) -1;
        double divide = top / bottom;
        double multiply = principal * divide;

        String mortgage = NumberFormat.getCurrencyInstance().format(multiply);
        return mortgage;
    }
}
