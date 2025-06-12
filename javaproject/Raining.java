package javaproject;

import java.util.Scanner; 

public class Raining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Is it raining (yes/no)?");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("yes")) { 
            System.out.println("Take an umbrella.");
        } else {
            System.out.println("No need for an umbrella.");
        }

        sc.close();
    }
}
