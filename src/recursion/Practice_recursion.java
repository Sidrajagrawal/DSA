package recursion;
import java.util.*;

public class Practice_recursion {
	public static void main(String args[]) {
		int n = 3;
		generate(n,0,0,"");
	}

	private static void generate(int n,int open,int close,String ans) {
		// TODO Auto-generated method stub
		if(open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if(open < n) {
			generate(n,open+1, close ,ans+"(");
		}if(close < open) {
			generate(n,open, close+1 ,ans+")");
		}
		
	}
}
