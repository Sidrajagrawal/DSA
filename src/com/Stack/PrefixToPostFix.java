package com.Stack;
import java.util.*;

public class PrefixToPostFix {
	
	private static String Convert(String st) {
		Stack<String> stack = new Stack<>();
		
		for(int i = st.length()-1; i>=0; i--) {
			char ch = st.charAt(i);
			
			if(Character.isLetterOrDigit(ch)) {
				stack.push(""+ch);
			}else {
				String t1 = stack.pop();
				String t2 = stack.pop();
				stack.push(t1+t2+ch);
			}
		}
		return stack.peek();			
	}
	
	public static void main(String args[]) {
		String st = "/-AB*+DEF";
		System.out.println("Prefix Expression: "+st);
		System.out.println("Postfix Expression: "+Convert(st));
	}
}
