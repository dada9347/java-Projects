package javaproject;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class GraphStructure {

    public static void main(String[] args) {
        // Create an empty graph
        Map<String, List<String>> graph = new HashMap<>();

        // Add nodes and connections
        addConnection(graph, "Entrance", "Reptile House");
        addConnection(graph, "Entrance", "Bird Sanctuary");
        addConnection(graph, "Entrance", "Mammal Zone");
        addConnection(graph, "Reptile House", "Snake Pit");
        addConnection(graph, "Bird Sanctuary", "Parrot Pavilion");
        addConnection(graph, "Mammal Zone", "Lion Den");
        addConnection(graph, "Mammal Zone", "Elephant Enclosure");

        // Print graph
        for (String node : graph.keySet()) {
            System.out.println(node + " connects to: " + graph.get(node));
        }
    }

    // Helper method to add bi-directional edges
    public static void addConnection(Map<String, List<String>> graph, String from, String to) {
        graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
        graph.computeIfAbsent(to, k -> new ArrayList<>()).add(from);
    }
}
