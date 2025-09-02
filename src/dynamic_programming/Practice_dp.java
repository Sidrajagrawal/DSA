package dynamic_programming;

import java.util.*;

public class Practice_dp {
	public static void main(String args[]) {
		int n = 5;
		System.out.println(solve(n));
	}

	private static int solve(int n) {
		// TODO Auto-generated method stub
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2;i<dp.length;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
