
import java.util.*;

public class Days {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int cells[]=new int[n];
			for(int i=0;i<n;i++) {
				cells[i] = sc.nextInt();			
			}
            int ans[] = ansResult(cells,n);
            for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
		}

	}
	public static int[] ansResult(int cells[],int n) {
		int num = n%14==0 ? 14:n%14;
		int temp[] =new int[cells.length];
		while(n-->0) {
			for(int i=1;i<cells.length-1;i++) {
				temp[i]= cells[i-1]==cells[i+1] ? 1:0;
			}
			cells = temp.clone();
		}
		return cells;
	}

}
