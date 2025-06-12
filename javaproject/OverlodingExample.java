package javaproject;
class calculator {
	 int calculator(int a, int b) {
		 return a+b;
	 }
	 double calculator(double a,double b) {
		 return a * b;
	 }
	 int calculator(int a,int b, int c) {
		 return a * b * c;
	 }
}
public class OverlodingExample {
		 public static void main(String[] args) {
			 calculator c =new calculator();
			 System.out.println(c.calculator(12, 30));
			 System.out.println(c.calculator(12.5, 3.5));
			 System.out.println(c.calculator(12, 30, 80));
	 }

}
