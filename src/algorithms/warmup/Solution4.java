package algorithms.warmup;

import java.util.Scanner;

public class Solution4 {

	int pos = 0;
	int neg = 0;
	int zer = 0;
	
	public void check(int[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			
			int ans = Integer.signum(arr[i]);
			if(ans == 1){
				pos++;
			}else if (ans == -1) {
				neg++;
			}else {
				zer++;
			}
			
		}
		
		float positive = (float)pos/arr.length;
		float negative = (float)neg/arr.length;
		float zero = (float)zer/arr.length;

		System.out.printf("%1.6f\n",positive);
		System.out.printf("%1.6f\n",negative);
		System.out.printf("%1.6f\n",zero);
	}
	
	
	public static void main(String[] args) {
		
		Solution4 sol = new Solution4();
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        sol.check(arr);
    }
}
