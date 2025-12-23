package a2z;

import java.util.Arrays;

public class Maximum_sum_of_non_adjacent_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,4,9};
		int[] dp = new int[arr.length+1];
		Arrays.fill(dp, -1);
		System.out.println("Memoization: "+fun1(arr,arr.length-1,dp));
		System.out.println("Tablulation: "+fun2(arr));
		System.out.println("Space Optimization: "+fun3(arr));
	}
	

	private static int fun3(int[] arr) {
		int prev1 = arr[0];
		int prev2 = 0;
		for(int i=1; i<arr.length; i++) {
			int take = arr[i];
			if(i > 1) take += prev2;
			int nottake = 0 + prev1;
			int curri = Math.max(take, nottake);
			prev2 = prev1;
			prev1 = curri;
		}
		return prev1;
	}


	private static int fun2(int[] arr) {
		int[] dp = new int[arr.length+1];
		dp[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			int take = arr[i];
			if(i > 1) take += dp[i-2];
			int nottake = 0 + dp[i-1];
			dp[i] = Math.max(take, nottake);
		}
		return dp[arr.length-1];
	}


	private static int fun1(int[] arr, int idx,int[] dp) {
		if(idx == 0) return arr[idx];
		if(idx < 0) return 0;
		if(dp[idx] != -1) return dp[idx];
		int take = arr[idx] + fun1(arr,idx-2,dp);
		int nottake = 0 + fun1(arr,idx-1,dp);
		return dp[idx] = Math.max(take, nottake);
	}

}
