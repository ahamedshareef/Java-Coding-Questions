package SalesForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * only {[()]} are valid paranthesis and Empty is valid, 
 * samples valid:
 * (),[],{},{{}}.
 * 
 * not valid: ({[})
 * please complete the function:
 */

public class CheckParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();
		//arr.add("()[");
		arr.add("({[]})");
		
		
		
		//System.out.println(balance(arr));
		

	}
	
	public static void balance(ArrayList<String> arr) {
		
		
		 for(String s:arr)
	        {
	        Stack<Character> stack = new Stack<Character>();
	            boolean isValid = true;
	            
	            for (char c : s.toCharArray()) {
	                if (c == '(')
	                    stack.push(')');
	                else if (c == '{')
	                    stack.push('}');
	                else if (c == '[')
	                    stack.push(']');
	                else if (stack.isEmpty() || stack.pop() != c)
	                    {
	                        isValid = false;
	                        break;
	                    }
	            }
	            isValid= isValid && stack.isEmpty();
	            if(isValid)
	                System.out.println("Valid");
	            else
	                System.out.println("Not valid");

		
		
	}

}
}
