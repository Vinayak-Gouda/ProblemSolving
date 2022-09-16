
public class SecondLargest1 {
	public static void main(String args[]) {
		
		int arr[]= {23,45,67,89,12,34,56,17,81};
		
		int largest = Integer.MIN_VALUE;
		int Slargest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			Slargest =largest;
			largest=arr[i];
			
		}
		else if(arr[i]>Slargest && arr[i]!=largest) {
			Slargest=arr[i];
			
		}
		}
		if(Slargest==Integer.MIN_VALUE) {
			System.out.println("There is no second largest element");
		}
		else {
			System.out.println("Second Largest element:"+Slargest);
		}
	}

}
