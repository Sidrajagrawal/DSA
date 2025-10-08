package recursion;
import java.util.*;

public class Practice_recursion {
	public static void main(String args[]) {
		String s = "abca";
		solve(s,"");
	}

	private static void solve(String s, String p) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			boolean isCall = false;
			for(int j=i+1; j<s.length(); j++) {
				if(ch == s.charAt(j)) isCall = true;
			}
			String f = s.substring(0,i);
			String l = s.substring(i+1);
			if(isCall == false) solve(f+l, p+ch);
		}
		
	}
}
