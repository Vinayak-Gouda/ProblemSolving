
public class DeleteArrayElement {
	public static void main(String args[]) {
		
		int a[]= {10,20,30,40,50,60};
		
		int delete=30;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(delete==a[i]) {
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Element not Found");
		}
		else {
			System.out.println("Element "+delete+" deleted succesfully ");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
