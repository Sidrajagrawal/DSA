package recursion;
import java.util.*;

public class Permutation_II {
	
	public static void main (String args[]) {
		String s = "abca";
		List<Character> lst = new ArrayList<>();
		permut(s,"");
	}
	
	private static void permut(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			boolean val = true;
			for(int j = i+1; j<s.length();j++) {
				if(s.charAt(j) == ch) {
					val = false;
				}
			}
			if(val) {
				String s1 = s.substring(0,i);
				String s2 = s.substring(i+1);
				permut(s1+s2,ans+ch);
			}
		}

	}
}
