package com.amber;

public class Main {

    private static CalculateMortgage calculator;
    private static PaymentSchedule paymentSchedule;

    public static void main(String[] args) {
       String message =  Greeting.greetUser("Amber", "Jones");
        System.out.println(message);

        // When the methods are not static, we don't need a constructor, we just call a new instance
        int principal = new Principal().askPrincipal();
        double monthlyInterest = new Interest().askInterest();
        int months = new Years().askYears();

//        String mortgage = CalculateMortgage.calculateMortgage(principal, monthlyInterest, months);
        calculator = new CalculateMortgage(principal, monthlyInterest, months);
        String mortgage = calculator.calculateMortgage();



        System.out.println("Average monthly payment: " + mortgage);


//This is another example of NON STATIC methods in the PaymentSchedule class
        //1
//        PaymentSchedule.printSchedule(principal, monthlyInterest, months, numberOfPaymentsMade);
        //2
//        paymentSchedule = new PaymentSchedule(principal, monthlyInterest, months);
//        paymentSchedule.printSchedule();
        //3
        new PaymentSchedule(principal, monthlyInterest, months).printSchedule();


    }

}
//B = L[(1 + c)n - (1 + c)p]/[(1 + c)n - 1]
//https://www.mtgprofessor.com/formulas.htm
