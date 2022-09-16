import java.util.*;

public class MissingElementScanner {
	public static void main(String args[]) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of testcases:");
		int t=sc.nextInt();
				
		while(t-->0) {
			System.out.println("Enter size of Array:");
			int n=sc.nextInt();
			int arr[]=new int[n-1];
			
			System.out.println("Enter Elements");
			for(int i=0;i<n-1;i++) {
				arr[i]=sc.nextInt();
			}
			MyClass s=new MyClass();
			System.out.println("Missing Element is:");
			System.out.println(s.MissingNumber(arr, n));
		}
	}

}

class MyClass{
    int MissingNumber(int arr[], int n) {
      // Your Code Here
      int sum=0;
      int total = n*(n+1)/2;
      for(int num : arr){
          sum +=num;
          
      }
      return total-sum;
  }
}
