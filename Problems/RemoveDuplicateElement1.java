import java.util.*;

public class RemoveDuplicateElement1 {
	public static void main(String args[]) {
		int arr[]= {1,2,2,3,4,5,5};
		
		Set<Integer> hs=new HashSet<>();
		{
			for(int i=0;i<arr.length;i++) {
				hs.add(arr[i]);
			}
		}
		for(int i:hs) {
			System.out.print(i+" ");
		}
	}

}
