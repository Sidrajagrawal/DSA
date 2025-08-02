package String;

public class RemoveOuterParentheses {
	public static void main(String args[]) {
		String s ="(()())(())(()(()))";
		int c=0;
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch==')') c--;
			if(c!=0) ans.append(ch);
			if(ch=='(') c++;
		}
		System.out.println(ans);
	}
}
