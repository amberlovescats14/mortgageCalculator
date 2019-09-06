package com.amber;

public class Main {

    private static CalculateMortgage calculator;
    private static PaymentSchedule paymentSchedule;

    public static void main(String[] args) {
       String message =  Greeting.greetUser("Amber", "Jones");
        System.out.println(message);

        int principal = Principal.askPrincipal();
        double monthlyInterest =  Interest.askInterest();
        int months = Years.askYears();

//        String mortgage = CalculateMortgage.calculateMortgage(principal, monthlyInterest, months);
        calculator = new CalculateMortgage(principal, monthlyInterest, months);
        String mortgage = calculator.calculateMortgage();



        System.out.println("Average monthly payment: " + mortgage);

//        PaymentSchedule.printSchedule(principal, monthlyInterest, months, numberOfPaymentsMade);
        paymentSchedule = new PaymentSchedule(principal, monthlyInterest, months);
        paymentSchedule.printSchedule();


    }

}
//B = L[(1 + c)n - (1 + c)p]/[(1 + c)n - 1]
//https://www.mtgprofessor.com/formulas.htm
