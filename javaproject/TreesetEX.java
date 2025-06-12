package javaproject;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetEX {

	public static void main(String[] args) {
		 TreeSet<String> ts =new TreeSet<>(Comparator.reverseOrder());
		 ts.add("sumit");
		 ts.add("karan");
		 ts.add("anjali");
		 ts.add("mohan");
		 ts.add("zoya");
		 System.out.println("the names are:");
		 for(String names:ts) {
			 System.out.println(names);
		 }
		 

	}

}
