package stack;
import java.util.*;

public class PostfixToInfix {
	
	private static String Convert(String st) {
		Stack<String> stack = new Stack<>();
		
		for(int i=0; i<st.length(); i++) {
			char ch = st.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				stack.push(""+ch);
			}else {
				String t1 = stack.pop();
				String t2 = stack.pop();
				stack.push('('+t2+ch+t1+')');  // top2 + operator(*,/,+,-) + top1
			}
		}
		return stack.peek();
	}
	
	public static void main(String[] args) {
		String st = "AB-DE+F*/";
		System.out.println("Postfix Expression: "+st);
		System.out.println("Infix Expression: "+Convert(st));
	}
}
