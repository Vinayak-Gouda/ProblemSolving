import java.util.Scanner;
import java.util.Stack;

public class ValidParathess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			
			if(isValid(s)==true)
				System.out.println(true);
			else
				System.out.println(false);
		}

	}
	
public static boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<>();
        
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
                
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top =stack.peek();
                    if(top=='('&& c==')' || top=='{'&& c=='}' || top=='[' && c==']'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
        
    }

}
