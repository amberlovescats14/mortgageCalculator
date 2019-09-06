package com.amber;

import java.text.NumberFormat;

public class PaymentSchedule {
    private int principal;
    private double monthlyInterest;
    private int months;
    private int numberOfPaymentsMade = 1;
    String[] balances = new String[months];

    // This class is different because it takes in arguments to calculate and prints it
    // in a sout not in a return statment

    //constructor
    public PaymentSchedule(int principal, double monthlyInterest, int months) {
        this.principal = principal;
        this.monthlyInterest = monthlyInterest;
        this.months = months;
    }

    // THIS METHOD CALLS THE OTHER ONE INSIDE IT
    public void printSchedule(){
        System.out.println("----------------");
        System.out.println("Monthly Payments: ");

        for(short i =1; i < months; i++){
            numberOfPaymentsMade++;
            double b = paymentSchedule();
            // storing in an array
            balances[i] = NumberFormat.getCurrencyInstance().format(b);
            System.out.println(
                    NumberFormat.getCurrencyInstance().format(b)
            );

        }
    }

    public double paymentSchedule() {
            double top = (Math.pow(1+monthlyInterest, months) )- Math.pow(1 + monthlyInterest, numberOfPaymentsMade);
            double bottom = Math.pow(1+monthlyInterest, months) -1;
            double b = principal * (top / bottom);
            return b;
    }



}
