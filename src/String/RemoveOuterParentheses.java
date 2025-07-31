package String;

public class RemoveOuterParentheses {
	public static void main(String args[]) {
		String s = "(()())(())";
		int c=0;
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ')') c--;
			if(c!=0) ans.append(s.charAt(i));
			if(s.charAt(i) == '(') c++;
		}
		System.out.println(ans.toString());
	}
}
