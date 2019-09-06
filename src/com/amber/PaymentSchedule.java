package com.amber;

import java.text.NumberFormat;

public class PaymentSchedule {
    int principal;
    double monthlyInterest;
    int months;
    int numberOfPaymentsMade = 1;

    //constructor
    public PaymentSchedule(int principal, double monthlyInterest, int months) {
        this.principal = principal;
        this.monthlyInterest = monthlyInterest;
        this.months = months;
    }

    public double paymentSchedule() {
            double top = (Math.pow(1+monthlyInterest, months) )- Math.pow(1 + monthlyInterest, numberOfPaymentsMade);
            double bottom = Math.pow(1+monthlyInterest, months) -1;
            double b = principal * (top / bottom);
            return b;
    }



    public void printSchedule(){
        System.out.println("----------------");
        System.out.println("Monthly Payments: ");

        for(short i =1; i < months; i++){
            numberOfPaymentsMade++;
            double b = paymentSchedule();
            System.out.println(
                    NumberFormat.getCurrencyInstance().format(b)
            );

        }
    }
}