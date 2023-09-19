package stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack myStack = new Stack(4);
		myStack.push(1);
		myStack.push(13);
		myStack.push(2);
		
		myStack.printStack();
		System.out.println(myStack.pop().value);
		myStack.getTop();
		
		
		String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
        
        
        String s1 = "()()()";
        String s2 = "()(()";
        String s3 = "(()())";
        System.out.println(isBalancedParentheses(s1)); // true
        System.out.println(isBalancedParentheses(s2)); // false
        System.out.println(isBalancedParentheses(s3)); // true

        StackArray<Integer> stack = new StackArray<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);
        System.out.println("Before sorting:");
        stack.printStack();
        
        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
        
        
	}

	private static void sortStack(StackArray<Integer> stack) {
		
		 if (!stack.isEmpty()) {
	            // Remove the top item
	            int x = stack.pop();
	 
	            // Sort remaining stack
	            sortStack(stack);
	 
	            // Push the top item back in sorted stack
	            sortedInsert(stack, x);
	        }
	}

	private static void sortedInsert(StackArray<Integer> s, int x) {
		
		 if (s.isEmpty() || x > s.peek()) {
	            s.push(x);
	            return;
	        }
	 
	        // If top is greater, remove the top item and recur
	        int temp = s.pop();
	        sortedInsert(s, x);
	 
	        // Put back the top item removed earlier
	        s.push(temp);
	}

	private static String reverseString(String myString) {
	
		StackArray<Character> s = new StackArray();
		String ans = "";
		
		for(char c:myString.toCharArray())
		s.push(c);
		
		for(char c:myString.toCharArray())
		ans +=s.pop();
		
		return ans;
		
	}
	
	private static boolean isBalancedParentheses(String s) {
		StackArray<Character> stac = new StackArray();
		
		for(char c:s.toCharArray()) {
			
			switch(c) {
			case ')': if(stac.pop()!= '(') return false; continue;
			default : stac.push(c);
			}
		}
		
		
		return stac.isEmpty();
	}

}
