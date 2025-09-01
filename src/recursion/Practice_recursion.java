package recursion;
import java.util.*;

public class Practice_recursion {
	public static void main(String args[]) {
		String ques = "abc";
		solve(ques,"");
	}

	private static void solve(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			solve(s1+s2,ans+ch);
		}
		
	}
}
