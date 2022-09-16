import java.util.*;
public class FirstDuplicate1 {
	
	public static void main(String args[]) {
		int arr[]= {12,12,43,25,67,12,34,34,78,43};
		int temp=-1;
		HashSet<Integer> hs=new HashSet<Integer>();
		{
			for(int i=arr.length-1;i>=0;i--) {
				if(hs.contains(arr[i])) {
					temp=i;
				}
				else {
					hs.add(arr[i]);
				}
			}
		}
		if(temp!=-1) {
			System.out.println("First Duplicate Element is:"+arr[temp]);
		}
		else {
			System.out.println("no duplicate elements is there");
		}
	}

}
