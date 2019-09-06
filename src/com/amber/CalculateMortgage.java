package com.amber;

import java.text.NumberFormat;

public class CalculateMortgage {
    private int principal;
    private double monthlyInterest;
    private int months;
    private String mortgage;

    //constructor
    public CalculateMortgage(int principal, double monthlyInterest, int months) {
        this.principal = principal;
        this.monthlyInterest = monthlyInterest;
        this.months = months;
    }

    //SET

    public String calculateMortgage() {
        double top = monthlyInterest * Math.pow(1 + monthlyInterest, months);
        double bottom = Math.pow(1 + monthlyInterest, months) -1;
        double divide = top / bottom;
        double multiply = principal * divide;

        this.mortgage = NumberFormat.getCurrencyInstance().format(multiply);

        return "Monthly payment: " + mortgage;
    }

    //GET
    public String getMortgage() {
        return mortgage;
    }
}
