package recursion;
import java.util.*;

public class Practice_recursion {
	public static void main(String args[]) {
		int n =3;
		System.out.println(solve(n," "));
		
	}

	private static int solve(int n, String p) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(p);
			return 1;
		}
		char ch = p.charAt(p.length()-1);
		int ls = 0;
		int rs = 0;
		if(ch != 'H') ls = solve(n-1,p+"H");
		if (ch != 'T') rs = solve(n-1,p+"T");
		return ls+rs;
	}
}
