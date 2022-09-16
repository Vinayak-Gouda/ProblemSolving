
public class MaximumSumSubArray {
	public static void main(String args[]) {
		
		int a[]= {-2,1,-3,4,-1,2,1,-5,4};
		
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		int s=0,start=0,end=0;
		
		for(int i=0;i<a.length;i++) {
			max_ending_here = max_ending_here+a[i];
			if(max_so_far<max_ending_here) {
				max_so_far = max_ending_here;
				start=s;
				end=i;
			}
			if(max_ending_here<0) {
				max_ending_here=0;
				s=i+1;
			}
		}
		System.out.println("Maximum sum of subarray is:"+max_so_far);
		System.out.println("Strating index position of subarray is "+start+" Ending index position of subarray is "+end);
	}

}
