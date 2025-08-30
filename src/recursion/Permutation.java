package recursion;
import java.util.*;

public class Permutation {
	public static void main (String args[]) {
		String s = "abc";
		permut(s,"");
		System.out.println(count_permut(s,""));
	}

	private static void permut(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			String s1 = s.substring(0,i);
			String s2 = s.substring(i+1);
			permut(s1+s2,ans+ch);
		}

	}
	
	private static int count_permut(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			return 1;
		}
		
		int count = 0;

		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			String s1 = s.substring(0,i);
			String s2 = s.substring(i+1);
			count += count_permut(s1+s2,ans+ch);
		}

		return count;
	}
}
