package javae2;

public class LogTimeExample {

	public static void main(String[] args) {
		int[] numbers = {5,6,3,4,2,10,10,11,13};
		int target =10 ;
		int low = 0;
		int high = numbers.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			if(numbers[mid] == target) {
				System.out.println("Found number"+ target+"at positon: "+mid);
				return;
			}else if(numbers[mid] < target) {
				low = mid+1;
			}else {
				high = mid - 1;
			}
		}
		System.out.println("number not found");
		// TODO Auto-generated method stub

	}

}
