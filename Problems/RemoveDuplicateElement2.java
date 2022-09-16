import java.util.*;

public class RemoveDuplicateElement2 {

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
			MyVinu rd = new MyVinu();
			Set<Integer> ans = rd.RemoveDuplicate(arr,n);
			for(int i:ans) 
			System.out.print(i+" ");
		}
	}
}

class MyVinu{
	Set<Integer> RemoveDuplicate(int arr[],int n) {
		
		Set<Integer> hs=new HashSet<>();
		{
			for(int i=0;i<arr.length;i++) {
				hs.add(arr[i]);
			}
		}
		return hs;
	}
}
