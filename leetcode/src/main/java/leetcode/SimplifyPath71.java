package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SimplifyPath71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "/../";
		System.out.println(simplifyPath(path));
		

	}
	
	
	public static String simplifyPath(String path) {
		
		Stack<String> stack = new Stack<String>();
		String[] s = path.split("/");
		System.out.println(Arrays.toString(s));
		for(String str:s) {
			if(!stack.isEmpty() && str.equals(".."))
				stack.pop();
			if(!str.equals(".") && !str.equals("..") && !str.equals(""))
				stack.push(str);
		}
		
		
		List<String> list = new ArrayList<String>(stack);
		
		return "/"+String.join("/", list);
	        
	    }

}
