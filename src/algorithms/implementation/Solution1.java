package algorithms.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

	public String check(int[] arr, int min){
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] >= 0){
				
				count++;
			}
		}
		
		if(count >= min){
			return "NO";
		}
		return "YES";
	}
	
	public static void main(String[] args) {
		
		Solution1 call = new Solution1();
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
    
        	if(k <= n && k >=1 && t <= 10 && t >= 1 && n <= 1000 && n >= 1){
        		System.out.println(call.check(a, k));
    		}
    	
            
        }
        
        
    }
}
