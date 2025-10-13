package dynamic_programming;
import java.util.*;

public class Practice_dp {
	public static void main(String[] args) {
		int n = 5;
		int[] dp = new int[n+1];
		System.out.println(fibo(n,dp));
	}

	private static int fibo(int n, int[] dp) {
		// TODO Auto-generated method stub
		if(n == 0 || n==1) return n;
		if(dp[n]!=0) return dp[n];
		int lf = fibo(n-1, dp);
		int rf = fibo(n-2, dp);
		return dp[n] = lf+rf;
	}
}
