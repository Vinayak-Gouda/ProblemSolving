
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LightSwitch {
	public static void main(String args[]) throws IOException {
	/*Scanner sc=new Scanner(System.in);
	int t = sc.nextInt();
	
	//while(t-->0) {
		int n=sc.nextInt();
		
		int light[] =new int[n];
		for(int i=0;i<n;i++) {
			light[i]=sc.nextInt();
		}
		int ans =numTimesAllBlue(light,n);
		System.out.println(ans);
	//}*/
		BufferedReader br =
	            new BufferedReader(new InputStreamReader(System.in));
	        //System.out.println("Enter Number of testcases:");
	        int t = Integer.parseInt(br.readLine().trim());
	        //while (t-- > 0) {
	        	//System.out.println("Enter size:");
	            int n = Integer.parseInt(br.readLine().trim());
	            //System.out.println("Enter Elements:");
	            String[] str = br.readLine().trim().split(" ");
	            int[] light = new int[n];
	            for (int i = 0; i < n ; i++) {
	                light[i] = Integer.parseInt(str[i]);
	            }
	            //Solution sln = new Solution();
	           // System.out.println("Missing Element is:");
	           // System.out.println(sln.MissingNumber(light, n));
	            int ans = numTimesAllBlue(light,n);
	            System.out.println(ans);
	        //}
 }
	
	public static int numTimesAllBlue(int[]light,int n) {
		long sum=0;
		long expected =0;
		int j=1;
		int count=0;
		for(int i:light) {
			sum+=i;
			expected+=j++;
			if(sum==expected) {
				count++;
			}
		}
		return count;
	}

}
