package com.Stack;
import java.util.*;

public class PracticeStack {
	public static void main(String args[]) {
		String s = "(()())(())";
		Stack<Character> stack = new Stack<>();
		int i=0;
		StringBuilder ans = new StringBuilder();
		while(i<s.length()) {
			char ch = s.charAt(i);
			if(ch == '(') {
				stack.push(ch);
			}else {
				if(stack.size() > 1) {
					while(stack.size() > 1) {
						if(stack.size() == 2) {
							ans.append(s.charAt(i));	
						}else if(stack.size() > 2) {
							ans.append(stack.pop());
						}
					}
				}else {
					stack.pop();
				}
			}
			i++;
		}
		System.out.print(ans);
	}
}
