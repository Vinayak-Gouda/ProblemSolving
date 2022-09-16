import java.util.*;

public class MajorityElement {
	
	public static void main(String args[]) {
		
		int a[]= {3,1,3,3,2};
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        

        for(int i=0;i<a.length;i++){

            

            if(map.containsKey(a[i])){

                

                int count = map.get(a[i]) +1;

                

                    if (count > a.length /2) {

                        System.out.println("Majority found :- " + a[i]);

                        //return a[i];

                        

                    } else

                        map.put(a[i], count);

                

            }else{

                 map.put(a[i],1);

            }

           

        }

       //for one element present in array:

       /* if(a.length==1){

            //return a[0];
        	System.out.println("length is one");

        }*/

       //System.out.println(" No Majority element");

        //return -1;
	}
	
	

}


