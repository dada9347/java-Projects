package javaproject;

import java.util.Scanner;

public class palindromnumber{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scanner.nextInt();  

        int originalNumber = input;     
        int reversedNumber = 0;

        
        while (input != 0) {
            int digit = input % 10;                   
            reversedNumber = reversedNumber * 10 + digit; 
            input = input / 10;                       
        }

     
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close();  
    }
}
