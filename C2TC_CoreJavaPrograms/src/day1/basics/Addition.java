package day1.basics;

import java.util.Scanner;

public class Addition {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

       
        int c = a + b;

        
        System.out.println("Addition of a = " + a + " and b = " + b + " is " + c);

        
   
    }
}
