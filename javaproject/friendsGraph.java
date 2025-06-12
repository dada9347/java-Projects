package javaproject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class friendsGraph {

	public static void main(String[] args) {
		Map<String, List<String>>graph = new HashMap<>();
		graph.put("Alice",Arrays.asList("Bod"));
		graph.put("Bod",Arrays.asList("alice","charlie"));
		graph.put("charlie",Arrays.asList("Bod"));

		for(String person : graph.keySet()) {
			System.out.println(person + "is friends with"+graph.get(person));
			
		}

	}

}
