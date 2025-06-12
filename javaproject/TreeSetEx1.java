package javaproject;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<String> ts=new TreeSet<>();
		ts.add("keyboard");
		ts.add("mouse");
		ts.add("monitor");
		ts.add("cpu");
		ts.add("webcam");
		System.out.println("enter the product name;");
		String str=sc.nextLine().toLowerCase();
		//System.out.println(ts.contains(str));
		if(str.isEmpty()) {
			System.out.println("invalid input");
		}
		else 
		{
			if(ts.contains(str)) {
				 System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		sc.close();
	}

}
