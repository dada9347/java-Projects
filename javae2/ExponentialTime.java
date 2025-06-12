package javae2;

public class ExponentialTime {

	public static int fibonacci(int n) {
		if(n <= 1) {
			return n;
			
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		int n =5;
		System.out.println("fabonacci of "+ n +" is:"+fibonacci(n) );
		/*  logic
		 F(5) = F(4) + F(3)
	     = (F(3) + F(2)) + (F(2) + F(1))
	     = ((F(2) + F(1)) + (F(1) + F(0))) + ((F(1) + F(0)) + F(1))
	     = ((1 + 1) + (1 + 0)) + ((1 + 0) + 1)
	     = (2 + 1) + (1 + 1)
	     = 3 + 2
	     = 5
*/
	}

}
