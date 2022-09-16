
public class FirstDuplicate {
	public static void main(String args[]) {
		
		int arr[]= {12,43,25,67,12,34,78,43};
		int temp =0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("First Duplicate element:");
					System.out.println(arr[i]+" ");
					temp = temp+1;
					break;
				}
			}
			if(temp>0) {
				break;
			}
		}
	}

}
