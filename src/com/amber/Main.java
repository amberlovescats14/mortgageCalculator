package com.amber;

public class Main {


    public static void main(String[] args) {
        //THIS NEEDS TO BE sout because the functions uses a return statment .
        // u cant view a return statment in the console
       String sayHello = new Greeting("Amber", "Jones").greetUser();
        System.out.println(sayHello);

        // When the methods are not static, we don't need a constructor, we just call a new instance
        int principal = new Principal().askPrincipal();
        double monthlyInterest = new Interest().askInterest();
        int months = new Years().askYears();

         String monthlyPayment = new CalculateMortgage(principal, monthlyInterest, months).calculateMortgage();
        System.out.println(monthlyPayment);


//LOOK AT THIS EXAMPLE
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
