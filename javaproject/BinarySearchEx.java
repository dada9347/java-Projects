package javaproject;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] names= {"Amit","Divya","Karan","Priya","Zoya"};
		System.out.println("Enter the name:");
		String str=sc.nextLine();
		if(Arrays.asList(names).contains(str)) {
			System.out.println(str+" is founded");
		}else {
			System.out.println(str+" is not founded");
		}
		sc.close();
	}

}
