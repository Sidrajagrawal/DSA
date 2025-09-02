package recursion;
import java.util.*;

public class Practice_recursion {
	public static void main(String args[]) {
		int n = 5;
		System.out.println(solve(n));
	}

	private static int solve(int n) {
		// TODO Auto-generated method stub
		if(n == 0 || n==1) return n;
		
		int f1 = solve(n-1);
		int f2 = solve(n-2);
		
		return f1+f2;
	}
}
