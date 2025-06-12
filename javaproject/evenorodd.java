package javaproject;
import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("enter a number:");
		 int input = number.nextInt();
		if (input % 2 == 0) {
			System.out.println("it is an even");
		}else {
			System.out.println("it is an odd number");
		}
 number.close();
	}

}
