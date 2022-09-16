import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,5,6,3,67,89,23};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			if(i==1) {
				break;
			}
		}
		System.out.println("Elements are:");
		for(int i:arr) {
			System.out.print(i+" ");
			}
		System.out.println();
		System.out.println("Second Largest Eelenment:"+arr[1]);

	}

}
