package DSA_SelfPlaced;

import java.util.Stack;

public class ReverseStringStack {
	
	public static void main(String arg[]) {
		String str = "Ahamed round one";
		
		reverseWords(str);
		reverseEntire(str);
		
	}

	private static void reverseEntire(String str) {
		// TODO Auto-generated method stub
		char[] ch = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char c:ch) {
			stack.push(c);
		}
		
		for(;!stack.isEmpty();) {
			System.out.print(stack.pop());
		}
		
		
	}

	private static void reverseWords(String str) {
		// TODO Auto-generated method stub
		
		String[] words = str.split(" ", 0);
		
		Stack<String> stack = new Stack<>();
		
		for(String w:words) {
			stack.push(w);
		}
		
		for(;!stack.isEmpty();) {
			System.out.print(stack.pop()+" ");
		}
		
		
	}

}
