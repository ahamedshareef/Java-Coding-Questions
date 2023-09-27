package stack;
//Stack: Push for a Stack That Uses an ArrayList ( ** Interview Question)

import java.util.ArrayList;

public class StackArray<T> {
	
	
	 private ArrayList<T> stackList = new ArrayList<>();  
	    
	    public ArrayList<T> getStackList() {
	        return stackList;
	    }
	    
	    public void printStack() {
	        for (int i = stackList.size()-1; i >= 0; i--) {
	            System.out.println(stackList.get(i));
	        }
	    }
	    
	    public boolean isEmpty() {
	        return stackList.size() == 0;
	    }
	    
	    public T peek() {
	        if (isEmpty()) {
	            return null;
	        } else {
	            return stackList.get(stackList.size() - 1);
	        }
	    }
	    
	    public int size() {
	        return stackList.size();
	    }
	    
	    public void push(T e) {
	    	stackList.add(e);
	    }
	    
	    public T pop() {
	    	
	    	if (isEmpty()) {
	            return null;
	        } else {
	        	T val = stackList.get(stackList.size() - 1);
	        	stackList.remove(stackList.size() - 1);
	        	return val;
	        }
	    	
	    }

}