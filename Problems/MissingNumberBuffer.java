
import java.io.*;
import java.util.*;
	
public class MissingNumberBuffer {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br =
	            new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter Number of testcases:");
	        int t = Integer.parseInt(br.readLine().trim());
	        while (t-- > 0) {
	        	System.out.println("Enter size:");
	            int n = Integer.parseInt(br.readLine().trim());
	            System.out.println("Enter Elements:");
	            String[] str = br.readLine().trim().split(" ");
	            int[] array = new int[n - 1];
	            for (int i = 0; i < n - 1; i++) {
	                array[i] = Integer.parseInt(str[i]);
	            }
	            Solution sln = new Solution();
	            System.out.println("Missing Element is:");
	            System.out.println(sln.MissingNumber(array, n));
	        }
	    }
}

class Solution {
      int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum=0;
        int total = n*(n+1)/2;
        for(int num : array){
            sum +=num;
            
        }
        return total-sum;
    }
}
