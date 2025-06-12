package javaproject;
import java.util.*;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Integer,String> numbers = new TreeMap<>();
		numbers.put(50, "A");
		numbers.put(20,"B");
		numbers.put(10,"C");
		numbers.put(30,"D");
		numbers.put(40,"E");
		numbers.put(60,"F");
		numbers.put(70,"G");
		System.out.println(numbers);	

	}
}
