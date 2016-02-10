package algorithms.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {
    
    
    public static void insertIntoSorted(int[] ar) {
        
    	if(ar.length >= 1 && ar.length <= 1000 ){
            
            for(int i = 1; i < ar.length; i++){
                
                int temp = ar[ar.length - 1];
                int j = 2;
                
                for(j = ar.length - j; j <= ar.length; j-- ){
                System.out.println("comparing "+ ar[ar.length - 1] +" "+ar[j] );    
                	if(j > 0){
                		
                		if(ar[j] > temp){
                			ar[j+1] = ar[j];
                        } else{
                        	ar[j+1] = temp;
                        }
                	}
                    
                }
            }
        }
        
        
        for(int k = 0; k < ar.length; k++){
            System.out.print(ar[k]);
            System.out.print(" ");
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
