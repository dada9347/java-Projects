package javaproject;

import java.util.Scanner;

public class Binarytask1 {
	static class Node{
		String data;
		Node left,right;
		
		Node(String value){
			data = value;
			left=right=null;
			
		}
	}

	public static void main(String[] args) {
		Node root=new Node("Mom");
		root.left=new Node("Dad");
		root.right=new Node("you");
System.out.println("the root of the binary tree  "+root.data);
System.out.println("the left and right right node of root node "+root.left.data+" "+root.right.data);
System.out.println();

	}

}
