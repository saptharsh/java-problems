package algorithms;

import java.util.Scanner;

public class Solution3 {

	int sumPrimary = 0;
	int sumSecondary = 0;
	
	public int sum1(int n, int[][] arr) {
		// difference of both the diagonals
		for (int a_i = 0; a_i < n; a_i++) {

			sumPrimary += arr[a_i][a_i];
			sumSecondary += arr[a_i][arr.length - 1 - a_i];
			
			//System.out.println(arr.length - 1 - a_i);
		}
		
		return Math.abs(sumPrimary - sumSecondary);
	}

	public static void main(String[] args) {

		Solution3 sol = new Solution3();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}

		System.out.println(sol.sum1(n, a));
	}
}
