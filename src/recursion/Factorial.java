package recursion;
import java.util.*;

public class Factorial {
	public static void main(String args[]) {
		int n = 5;
		System.out.print(fac(n));
	}

	private static int fac(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1) {
			return 1;
		}
		int f = n*fac(n-1);
		return f;
	}
}
