package stack;
import java.util.*;

public class InfixToPrefix {
	
	static int priority(char ch) {
		if(ch == '*' || ch == '/') return 2;
		else if(ch == '+' || ch == '-') return 1;
		return -1;
	}
	
	static StringBuilder Convert(StringBuilder st) {
	    StringBuilder ans = new StringBuilder();
	    Stack<Character> stack = new Stack<>();

	    st.reverse();
	    for (int i = 0; i < st.length(); i++) {
	        char ch = st.charAt(i);
	        if (ch == '(') st.setCharAt(i, ')');
	        else if (ch == ')') st.setCharAt(i, '(');
	    }

	    for (int i = 0; i < st.length(); i++) {
	        char ch = st.charAt(i);
	        if (Character.isLetterOrDigit(ch)) {
	            ans.append(ch);
	        } else if (ch == '(') {
	            stack.push(ch);
	        } else if (ch == ')') {
	            while (!stack.isEmpty() && stack.peek() != '(') {
	                ans.append(stack.pop());
	            }
	            if (!stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            }
	        } else {
	            while (!stack.isEmpty() && priority(ch) < priority(stack.peek())) {
	                ans.append(stack.pop());
	            }
	            stack.push(ch);
	        }
	    }

	    while (!stack.isEmpty()) {
	        ans.append(stack.pop());
	    }

	    return ans.reverse();
	}
	
	public static void main(String[] args) {
		StringBuilder st = new StringBuilder("(A+B)*C-D+F");	
		System.out.println("Infix Expression: "+st);
		System.out.println("Prefix Exression: "+Convert(st));
	}
}
