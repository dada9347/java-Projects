package javaproject;

class car extends Thread{
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
class bike extends Thread{
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
public class SimpleRaceing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		new car().start();
		new bike().start();

	}

}
