package com.amber;

import java.text.NumberFormat;

public class CalculateMortgage {
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
