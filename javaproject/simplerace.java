package javaproject;


class car implements Runnable{
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println("BMW car moveing" +1);
			try {
				Thread.sleep(500);
			}catch(Exception e) {	
			}
		}
		}
}
class bike implements Runnable{
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println("bike is moving" +1);
			try {
				Thread.sleep(500);
			}catch(Exception e) {	
			}
		}
	}
}
public class Simpleraceing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		
		Thread caThread=new Thread(new car())
		Thread baThread=new Thread(new bike())
		System.out.println("good");
		caThread.start();
		baThread.start();

	}

}
