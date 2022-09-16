
public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,34,55,78,45};
		
		int pos=3;
		int element=25;
		
		for(int i=arr.length-1;i>pos-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos-1]=element;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
