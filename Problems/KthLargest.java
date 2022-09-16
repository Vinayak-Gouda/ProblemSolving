
public class KthLargest {
	public static void main(String args[]) {
		
		int arr[]= {1,4,5,6,3,67,89,23};
		int temp;
		int k=4;
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
		System.out.println("Elements are:");
		for(int s:arr) {
			System.out.print(s+" ");
			}
		System.out.println();
		System.out.println("Kth Largest Element is:"+arr[k-1]);
		//System.out.println();

	}

}
