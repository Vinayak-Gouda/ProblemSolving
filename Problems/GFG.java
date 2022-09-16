
public class GFG {
	
	static int negProdSubArr(int arr[],int n) {
		int positive =1,negative=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>0)
				arr[i]=1;
			else
				arr[i]=-1;
			
			if(i>0)
				arr[i] *=arr[i-1];
			
			if(arr[i]==1)
				positive++;
			else
				negative++;
		}
		return (positive*negative);
	}
	
	public static void main(String args[]) {
		int arr[]= {5,-4,-3,2,-5};
		int n=arr.length;
		
		int arr1[] = {-1,2,-2};
		int n1=arr1.length;
		
		System.out.println(negProdSubArr(arr,n));
		System.out.println(negProdSubArr(arr1,n1));
	}

}
