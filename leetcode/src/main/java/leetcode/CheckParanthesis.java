package leetcode;

import java.util.EmptyStackException;
import java.util.Stack;

public class CheckParanthesis {

	public static void main(String[] args) {
		String s = "()";
		 
		 
		boolean isValid = isValid(s);
		System.out.println(isValid);

	}
	
private static boolean isValid(String s) {
	
	Stack<Character> stack = new Stack<Character>();
	for(char c:s.toCharArray()) {
		switch(c) {
		case ']': if(stack.isEmpty() || stack.pop() != '[') return false;break;
		case '}': if(stack.isEmpty() || stack.pop() != '{') return false;break;
		case ')': if(stack.isEmpty() || stack.pop() != '(') return false;break;
		default:
			stack.push(c);
		}
	}
	return stack.isEmpty();
		
	}





	private static boolean isValid2(String s) {
		
		char[] ch = s.toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		try {
		for(char ch1 :ch) {
			switch(ch1) {
			
			case '{':
				stack.push(ch1);continue;
			case '(':
				stack.push(ch1);continue;
			case '[':
				stack.push(ch1);continue;
			case ']':
				if(stack.peek().equals('[')) { stack.pop();break;}else {return false;}
			case '}':
				if(stack.peek().equals('{')) { stack.pop();break;}else {return false;}
			case ')':
				if(stack.peek().equals('(')) { stack.pop();break;}else {return false;}
			default:
				return false;
				
			}
		}
		if(stack.empty())
		return true;
		else
			return false;
		}
		catch(EmptyStackException e) {
			return false;
		}
	}
	
	
	
	
		
	}


