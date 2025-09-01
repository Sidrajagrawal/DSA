package recursion;
import java.util.*;

public class Practice_recursion {
	public static void main(String args[]) {
		int n = 3;
		System.out.println(solve(n,""));
	}

	private static int solve(int n,String ans) {
		// TODO Auto-generated method stub
		if(n == 0) {
			System.out.println(ans);
			return 1;
		}
		
		int lc = 0;
		
		if(ans.length() == 0  || ans.charAt(ans.length()-1) != 'H') {
			lc = solve(n-1,ans+"H");	
		}
		int rc = solve(n-1,ans+"T");
		return lc+rc;
	}
}
