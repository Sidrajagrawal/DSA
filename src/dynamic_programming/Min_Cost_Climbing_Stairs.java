package dynamic_programming;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
	class Solution {
	    public int minCostClimbingStairs(int[] cost) {
	    	int [] dp = new int[cost.length];
	    	Arrays.fill(dp, -1);
	    	int min1 = climb(cost,dp,0);
	    	int min2 = climb(cost,dp,1);
	    	return Math.min(min1, min2);
	    }

		private int climb(int[] cost, int[] dp, int i) {
			// TODO Auto-generated method stub
			if(i >= cost.length ) {
				return 0;
			}
			if(dp[i] != -1) {
				return dp[i];
			}
			
			int oneStep = climb(cost, dp, i+1);
			int twoStep = climb(cost, dp, i+2);
			
			return dp[i] = cost[i] + Math.min(oneStep, twoStep);
			
		}
	}
}
