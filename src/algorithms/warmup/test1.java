package algorithms.warmup;

import java.util.Scanner;

public class test1 {
	
	static int result = 0;
	static int solveMeFirst(int a, int b) {

		if(a >= 1 && b >= 1 && a <= 1000 && b <= 1000){
			
			result = a + b;
		}
	      
		return result;
	   }

	   
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a;
	        a = in.nextInt();
	        int b;
	        b = in.nextInt();
	        int sum;
	        sum = solveMeFirst(a, b);
	        System.out.println(sum);
	   }
}
