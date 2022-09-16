
import java.util.*;

public class RemoveDuplicateElement {
	public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.of testcases:");
	int t = sc.nextInt();
	
	while(t-->0) {
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Element:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("After Removing Duplicate Element:");
		int ans[]= RemoveDuplicate(arr,n);
		for(int i=0;i<ans.length;i++)
		System.out.print(ans[i]+" ");
	}
	}
	static int[] RemoveDuplicate(int arr[],int n) {
		
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
			temp[j] = arr[arr.length-1];
			for(int i1=0;i1<temp.length;i1++) {
				
			}
		}
		return temp;
	}
}