package stack;
import java.util.*;

public class PrefixToInfix {
	
	private static String Convert(String st) {
		Stack<String> stack = new Stack<>();
		
		for(int i=st.length()-1;i>=0; i--) {
			char ch = st.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				stack.push(""+ch);
			}else {
				String t1 = stack.pop();
				String t2 = stack.pop();
				stack.push("("+t1+ch+t2+")"); // top1 + operator(*,/,+,-) + top2
			}
		}
		
		
		return stack.peek();
	}
	
	public static void main(String args[]) {
		String st = "*+PQ-MN";
		System.out.println("Prefix Expression: "+st);
		System.out.println("Infix Expression: "+Convert(st));
	}
}
