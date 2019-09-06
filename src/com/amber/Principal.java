package com.amber;

import java.util.Scanner;

public class Principal {
    private int principal;


    //SET with Scanner
    public int askPrincipal(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Principal amount?");
            this.principal = scan.nextInt();
            if(principal > 1000 && principal < 1000000) break;
            System.out.println("Please enter an amount between 1K - 1M");
        }
        return principal;
    }

    //GET
    public int getPrincipal(){
        return principal;
    }
}


