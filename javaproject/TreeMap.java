package javaproject;

import java.util.TreeMap;
import java.util.Map;

public class Treemap    {

    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> studentMap = new TreeMap<>();

        // Adding entries to the TreeMap
        studentMap.put(105, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(101, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(103, "Eve");

        // Printing the TreeMap (automatically sorted by keys)
        System.out.println("Student TreeMap:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Accessing specific TreeMap methods
        System.out.println("\nFirst Entry: " + studentMap.firstEntry());
        System.out.println("Last Entry: " + studentMap.lastEntry());
        System.out.println("Higher Key than 103: " + studentMap.higherKey(103));
        System.out.println("Lower Key than 103: " + studentMap.lowerKey(103));
    }
}
