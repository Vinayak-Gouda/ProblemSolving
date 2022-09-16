
public class NotduplicateElement {
	
	public static void main(String args[]) {
		
		int arr[]= {12,34,34,56,78,56,78};
		
		int res=arr[0];
		for(int i=1;i<arr.length;i++) {
			res = res^arr[i];
		}
		System.out.println(res+" "+"not duplicate element");
	}

}
