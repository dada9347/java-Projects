package javaproject;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tasks =new ArrayList<String>();
	
	while(true) {
		System.out.println("simple To-Do-list-App");
		System.out.println("1.Add a task");
		System.out.println("3.delete a task");
		System.out.println("4.Exit");
		System.out.println("choose an option (1-4)");
		
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice == 1) {
			System.out.println("enter your task");
			String task = sc.nextLine();
			tasks.add(task);
			System.out.println("task added succesfull");

		}else if(choice == 2 ) {
			if(tasks.isEmpty()) {
				System.out.println("no task is found");
			}
		}
		else if(choice == 3) {
			if(tasks.isEmpty()) {
				System.out.println("nothing to delete");
			}else {
				System.out.println("Enter task number to delete");
				int tasknum = sc.nextInt();
				if(tasknum>=1 && tasknum <= tasks.size()) {
					tasks.remove(tasknum - 1);
					System.out.println("Task Deleted");
 				}else {
 					System.out.println("invlid number");
 				}
			}
			}
			else if(choice == 4) {
				System.out.println("goodbye !!");
				break;
			}else {
				System.out.println("please choice a vaild option");
			}
			sc.close();
		}




	}

}
