import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class TestCases {
	public static void main(String args[])throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int array[]=new int[n];
			for(int i=0;i<n-1;i++) {
				array[i] = Integer.parseInt(str[i]);
			}
			 int sum=0;
		      int total = n*(n+1)/2;
		      for(int num : array){
		          sum +=num;
		          
		      }
		      System.out.println(total-sum);
		}
	}
}

/*class Vinayak {
    int MissingNumber(int array[], int n) {
      // Your Code Here
      int sum=0;
      int total = n*(n+1)/2;
      for(int num : array){
          sum +=num;
          
      }
      return total-sum;
  }
}*/
