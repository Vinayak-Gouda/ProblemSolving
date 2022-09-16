
public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,6};
		
		int expected_no_element = arr.length+1;
		//System.out.println(expected_no_element);
		
		int total_sum = (expected_no_element*(expected_no_element+1))/2;
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Missing number:");
		System.out.println(total_sum-sum);

	}

}
