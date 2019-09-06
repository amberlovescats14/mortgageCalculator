package com.amber;

import java.text.NumberFormat;

public class CalculateMortgage {
    int principal;
    double monthlyInterest;
    int months;

    //constructor
    public CalculateMortgage(int principal, double monthlyInterest, int months) {
        this.principal = principal;
        this.monthlyInterest = monthlyInterest;
        this.months = months;
    }

    public String calculateMortgage() {
        double top = monthlyInterest * Math.pow(1 + monthlyInterest, months);
        double bottom = Math.pow(1 + monthlyInterest, months) -1;
        double divide = top / bottom;
        double multiply = principal * divide;

        String mortgage = NumberFormat.getCurrencyInstance().format(multiply);
        return mortgage;
    }
}