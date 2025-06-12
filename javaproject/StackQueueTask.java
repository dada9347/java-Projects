package javaproject;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTask {
    public static void main(String[] args) {
        
        Stack<String> toyBox = new Stack<String>();

       
        toyBox.push("BALLS");
        toyBox.push("BAT");
        toyBox.push("SNALE AND LADERS");

        
        String toyBeingPlayedWith = toyBox.pop();
        System.out.println("Playing with: " + toyBeingPlayedWith);

        
        System.out.println("Toys left in the toy box: " + toyBox);

        System.out.println();

       
        Queue<String> iceCreamLine = new LinkedList<>();

        
        iceCreamLine.add("MALLI");
        iceCreamLine.add("DADA");
        iceCreamLine.add("TEJA");

        
        String servedKid = iceCreamLine.poll(); 
        System.out.println("Serving ice cream to: " + servedKid);

        
        System.out.println("Kids still in line: " + iceCreamLine);
    }
}
