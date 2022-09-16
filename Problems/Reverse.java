
public class Reverse {
	
	public static void main(String args[]) {
		int arr[]= {23,12,45,67,12,1,3};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			temp[j++]=arr[i];
		}
		
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
