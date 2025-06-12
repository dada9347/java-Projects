package javaproject;
import java.util.Stack;
public class StackingPlates {

	public static void main(String[] args) {
      Stack<String> Plates = new Stack<String>();
      Plates.push("Plate 1");
      Plates.push("Plate 2");
      Plates.push("Plate 3");
      Plates.push("Plate 4");
      
  	System.out.println("frist plate: "+Plates.peek());
	System.out.println("no of plates in left side:");
	if(Plates.isEmpty()) {
		System.out.println("no");
	}

    		  

	}

}
