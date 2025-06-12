package javaproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class simpleBFS {

	public static void main(String[] args) {
		Map<String,List<String>> house=new HashMap<String,List<String>>();
		house.put("Living Room",Arrays.asList("Kitchen","Bedroom","Study Room"));
		house.put("Kitchen",Arrays.asList("Bathroom"));
		house.put("Bedroom",Arrays.asList("Balcony"));
		house.put("Study Room",new ArrayList<String>());//		house.put("Bath ArrayList<String>());
		house.put("Balcony",new ArrayList<String>());
		System.out.println("Exploring the house using BFS starting from living room");
		bfs(house,"Living Room");
		
	}

	public static void bfs(Map<String, List<String>> house, String startroom) {
		Queue<String> queue=new LinkedList<String>();
		Set<String> visited=new HashSet<String>();
		queue.add(startroom);
		visited.add(startroom);
		while(!queue.isEmpty()) {
			String currentroom=queue.poll();
			System.out.println("Visited "+currentroom);
		for(String neighbor:house.get(currentroom)) {
			if(visited.contains(currentroom)) {
				queue.add(neighbor);
				visited.add(neighbor);
				}
		}
	}
	}
}
