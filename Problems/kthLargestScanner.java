import java.util.*;

public class kthLargestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int temp;
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int k=sc.nextInt();
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}
				if(i==k-1) {
					break;
				}
			}
			System.out.println(arr[k-1]);
		}

	}

}
