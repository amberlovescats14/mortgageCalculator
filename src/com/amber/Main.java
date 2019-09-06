package com.amber;

public class Main {

    public static void main(String[] args) {
       String message =  Greeting.greetUser("Amber", "Jones");
        System.out.println(message);

        int principal = Principal.askPrincipal();
        double monthlyInterest =  Interest.askInterest();
        int months = Years.askYears();
        int numberOfPaymentsMade = 1;
        String mortgage = CalculateMortgage.calculateMortgage(principal, monthlyInterest, months);
        System.out.println("Average monthly payment: " + mortgage);

        PaymentSchedule.printSchedule(principal, monthlyInterest, months, numberOfPaymentsMade);




    }

}
//B = L[(1 + c)n - (1 + c)p]/[(1 + c)n - 1]
//https://www.mtgprofessor.com/formulas.htm
