package algorithms;

import java.util.Scanner;

// Form Big numbers replace int by long
public class test2 {

	int sum = 0;
	public int arraySum(int[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i != 0) {
				
				sum = arr[i]+sum;
			} else{
				
				sum = arr[i];
			}
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		test2 call = new test2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        System.out.println(call.arraySum(arr));
    }
}
