package com.amber;

public class Greeting {
    private String firstName;
    private String  lastName;

    public Greeting(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    //OUTSIDE THE MAIN
    //SET
    public String greetUser(){
       return "Hello " + firstName + " " + lastName;
    }

    //GET name
    public String getName() {
        return firstName + " " + lastName;
    }
}
