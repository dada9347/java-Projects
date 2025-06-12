package javaproject;

import java.util.TreeMap;

public class TreeMapEX {

	public static void main(String[] args) {
		TreeMap<String,String> numbers = new TreeMap<>();
		numbers.put("India", "New Delhi");
		numbers.put("USA", "Washington");
		numbers.put("Germany", "Berlin");
		numbers.put("Japan", "Tokyo");
		numbers.put("India", "Delhi");
		System.out.println(numbers);
		System.out.println("first key is:"+numbers.firstKey());
		System.out.println("last key is:"+numbers.lastKey());
		System.out.println("higher key is:"+numbers.higherKey("India"));
		System.out.println("lower key is:"+numbers.lowerKey("India"));

		System.out.println(numbers.containsValue("Tokyo"));
		System.out.println(numbers.containsKey("china"));
	}

}
