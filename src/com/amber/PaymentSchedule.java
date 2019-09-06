package com.amber;

import java.text.NumberFormat;

public class PaymentSchedule {
    public static double paymentSchedule(
            int principal,
            double monthlyInterest,
            int months,
            int numberOfPaymentsMade
    ) {
            double top = (Math.pow(1+monthlyInterest, months) )- Math.pow(1 + monthlyInterest, numberOfPaymentsMade);
            double bottom = Math.pow(1+monthlyInterest, months) -1;
            double b = principal * (top / bottom);
            return b;
    }

    public static void printSchedule(
            int principal,
            double monthlyInterest,
            int months,
            int numberOfPaymentsMade
    ){
        System.out.println("----------------");
        System.out.println("Monthly Payments: ");

        for(short i =1; i < months; i++){
            numberOfPaymentsMade++;
            double b = paymentSchedule(principal, monthlyInterest, months, numberOfPaymentsMade);
            System.out.println(
                    NumberFormat.getCurrencyInstance().format(b)
            );
        }
    }
}
