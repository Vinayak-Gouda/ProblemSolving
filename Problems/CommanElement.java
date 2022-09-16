
import java.util.*;
public class CommanElement {
	
	public static void main(String args[]) {
		
		int a1[]= {1,2,4,8,9};
		int a2[]= {1,4,9,10,14};
		int a3[]= {1,4,9,14};
		int x=0,y=0,z=0;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		while(x<a1.length && y<a2.length && z<a3.length ) {
			if(a1[x]==a2[y] && a2[y]==a3[z]) {
				al.add(a1[x]);
				x++;
				y++;
				z++;
			}
			else if(a1[x]<a2[y]) {
					x++;
				
			}
			else if(a2[y]<a3[z]) {
				y++;
			}
			else {
				z++;
			}
		}
		System.out.println("Comman Elements are:");
		for(int i:al) {
			System.out.print(i+" ");
		}
		
	}

}
