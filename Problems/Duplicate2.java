
import java.util.*;

public class Duplicate2 {
	public static void main(String args[]) {
		
		int arr[]= {12,43,25,67,12,34,78,43,43};
		Map<Integer,Integer> hm=new HashMap<>();
		{
			for(int no:arr) {
				Integer count= hm.get(no);
				if(count==null) {
					hm.put(no,1);
				}
				else {
					count = count+1;
					hm.put(no,count);
				}
			}
		}
		System.out.println("Duplicate elements are:");
		Set<Map.Entry<Integer, Integer>> es=hm.entrySet();
		for(Map.Entry<Integer, Integer> me:es) {
			if(me.getValue()>1) {
				System.out.print(me.getKey()+" ");
			}
	}
	}

}
