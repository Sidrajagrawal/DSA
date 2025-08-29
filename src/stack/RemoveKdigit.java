package stack;
import java.util.*;

public class RemoveKdigit {
	
	static String Remove(String st,int k) {
		StringBuilder ans = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<st.length();i++) {
			while(!stack.isEmpty() && k>0 && (stack.peek() - '0') > (st.charAt(i)-'0')) {
				stack.pop();
				k=k-1;
			}
			stack.push(st.charAt(i));
		}
		while(k>0) stack.pop(); k--;
		if(stack.isEmpty()) return "0";
		while(!stack.isEmpty()) {
			ans.append(stack.pop());
		}
		
		return ans.reverse().toString();
	}
	
	public static void main(String args[]) {
		String st ="1432219";
		int k=3;
		System.out.println(Remove(st,k));
	}
}
