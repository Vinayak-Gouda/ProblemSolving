import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class minSub {
public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter no.of testcases:");
		int t = sc.nextInt();
		
		while(t-->0) {
			//System.out.println("Enter size of array:");
			int n = sc.nextInt();
			int arr[]=new int[n];
			//System.out.println("Enter Element:");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			//System.out.println("After Removing Duplicate Element:");
			Answer rd = new Answer();
			int ans = rd.minSubset(arr,n);
			System.out.print(ans);
		}
	}

}


class Answer { 
    int minSubset(int[] arr,int n) { 
        if(n==1) return 1;
        Arrays.sort(arr);
        long sum=0;
        
        for(int i:arr){
            sum+=i;
        }
        long s2=0;
        int count=0;
        for(int i=n-1;i>=0;i--){
                s2+=arr[i];
                sum-=arr[i];
            if(sum<s2) return n-i; 
        }
        return n-1;
    }
}