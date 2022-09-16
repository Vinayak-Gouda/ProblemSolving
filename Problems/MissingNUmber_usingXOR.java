
public class MissingNUmber_usingXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,8};
		
		int xor1=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			xor1 = xor1^arr[i];
		}
		
		int xor2=1;
		
		for(int i=2;i<=arr.length+1;i++) {
			xor2 = xor2^i;
		}
		System.out.println("Missing Element is:"+(xor2^xor1));

	}

}
