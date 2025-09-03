package dynamic_programming;

import java.util.*;

public class Practice_dp {
	public static void main(String args[]) {
		int[] arr = {2,7,9,3,1};
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(solve(arr,0,dp));
	}

	private static int solve(int[] arr,int i, int[] dp) {
		if(i >= arr.length) {
			return 0;
		}
		
		if(dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + solve(arr,i+2,dp);
		int Dont_rob =  solve(arr,i+2,dp);
		
		return dp[i] = Math.max(rob, Dont_rob);
	}
}
