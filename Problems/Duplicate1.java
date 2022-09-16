
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Duplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,4,5,4,2,3};
		
		Set<Integer> s=new HashSet<>();
		for(int no:arr) {
			if(s.add(no)==false) {
				System.out.print(no+" ");
			}
		}

	}

}
