package algorithms.warmup;

import java.util.Scanner;

public class Solution5 {

	public void print(int size){
		
		for (int i = 1; i <= size; i++) {
			
			for (int j = 1; j <= size; j++) {
				
				if((i+j) > size){
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Solution5 sol = new Solution5();
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        sol.print(n);
    }

}
