package leetcode;

import java.util.Stack;

public class ReversePolish150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = {"4","13","5","/","+"};
		System.out.println(evalRPN(tokens));

	}

	private static int evalRPN(String[] tokens) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (String t: tokens) {
			
			if(t.equals("+")) {
				stack.add(stack.pop() + stack.pop());
			}else if(t.equals("/")) {
				int b=stack.pop(); 
				int a=stack.pop();
				stack.add(a/b);
			}else if(t.equals("-")) {
				int b=stack.pop(); 
				int a=stack.pop();
				stack.add(a-b);
			}else if(t.equals("*")) {
				stack.add(stack.pop() * stack.pop());
			}else {
				stack.add(Integer.parseInt(t));
			}
			
		}
		return stack.pop();
		
		
		
	}

}
