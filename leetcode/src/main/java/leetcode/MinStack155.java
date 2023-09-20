package leetcode;

import java.util.Stack;

public class MinStack155 {

	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> min_value = new Stack<Integer>();
	
	 public MinStack155() {
		
	    }
	    
	    public void push(int val) {
	    	
	    	if(min_value.isEmpty() || val <= min_value.peek())
	    		min_value.push(val);
	    	
	    	stack.push(val);
	        
	    }
	    
	    public void pop() {
	    	if(stack.peek().equals(min_value.peek()))
	    		min_value.pop();
	    	stack.pop();
	        
	    }
	    
	    public int top() {
	    	
	    	return stack.peek();
	        
	    }
	    
	    public int getMin() {
	    	
	    	return min_value.peek();
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}



   

