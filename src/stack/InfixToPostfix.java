package stack;
import java.util.*;

public class InfixToPostfix {
	
	private static int priority(char ch) {
		if(ch == '^') return 3;
		else if(ch == '*' || ch == '/') return 2;
		else if(ch == '+' || ch == '-') return 1;
		return -1;
	}
	
	private static StringBuilder Convert(String st) {
		StringBuilder ans = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<st.length(); i++) {
			char ch = st.charAt(i);
			
			if(Character.isLetterOrDigit(ch)) {
				ans.append(ch);
			} 
			else if(ch == '(') {
				stack.push(ch);
			} 
			else if(ch == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					ans.append(stack.pop());
				}
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} 
			} 
			else {
				while(!stack.isEmpty() && priority(ch) <= priority(stack.peek())) {
					if (ch == '^' && stack.peek() == '^') {
						break;
					}
					ans.append(stack.pop());
				}
				stack.push(ch);
			}
		}
		
		while(!stack.isEmpty()) {
			if(stack.peek() == '(' || stack.peek() == ')') {
			}
			ans.append(stack.pop());
		}
		return ans;
	}
	
	public static void main(String args[]) {
		String s = "a+b*(c^d-e)";
		System.out.println("Infix Expression: " + s);
		System.out.println("Postfix Expression: " + Convert(s));
	}
}