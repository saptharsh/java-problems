package algorithms.sorting;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int size = in.nextInt();
        
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            
            arr[i] = in.nextInt();
        }
        
        if(size <= 1000 && size >=1 && value <= 1000 && value <= 1000){
            
            for(int i = 0; i < arr.length; i++){
                
                if(arr[i] == value){
                    System.out.println(i);
                }
            }
        }
    }
}