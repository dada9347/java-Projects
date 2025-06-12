package javae2;

public class BubbleSortStrings {

	public static void main(String[] args) {
		
		        String[] arr = {"A","C","B","O","S","D"};
		        int n = arr.length;

		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                
		                if (arr[j].compareTo(arr[j + 1]) > 0) {
		                    
		                    String temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }

		        System.out.println("Sorted array:");
		        for (String word  : arr) {
		            System.out.print(word + " ");
		        }
		    }
		
}

	


