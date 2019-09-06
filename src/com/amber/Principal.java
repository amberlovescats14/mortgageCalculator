package com.amber;

import java.util.Scanner;

public class Principal {
    public static int askPrincipal(){
        Scanner scan = new Scanner(System.in);
        int principal;
        while(true){
            System.out.print("Principal amount?");
            principal = scan.nextInt();
            if(principal > 1000 && principal < 1000000) break;
            System.out.println("Please enter an amount between 1K - 1M");
        }
        return principal;
    }
}
