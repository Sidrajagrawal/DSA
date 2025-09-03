package dynamic_programming;

import java.util.*;

public class Practice_dp {
	public static void main(String args[]) {
		int[] arr = {2,7,9,3,1};
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
//		System.out.println(solve(arr,0,dp));
		System.out.println(solveBU(arr));
	}

	private static int solveBU(int[] arr) {
		// TODO Auto-generated method stub
		int [] dp = new int[arr.length];
		
		if(arr.length == 1) {
			return arr[0];
		}
		
		dp[0] = arr[0];
		dp[1] = Math.max(dp[0], arr[1]);
		
		for(int i = 2;i<arr.length;i++) {
			dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
		}
		
		int max = dp[0];
		for(int i=0;i<arr.length;i++) {
			max = Math.max(max, dp[i]);
		}
		return max;
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
