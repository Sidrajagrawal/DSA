package dynamic_programming;

import java.util.*;

public class House_Robber {
	class Solution {
	    public int rob(int[] nums) {
	        int[] dp = new int[nums.length];
	        Arrays.fill(dp, -1);
//	    	return robTB(nums,dp,0);
	        return robBU(nums);
	    }

		private int robBU(int[] nums) {
			// TODO Auto-generated method stub
			int[] dp = new int[nums.length];
			dp[0] = nums[0];
			dp[1] = Math.max(dp[0], nums[1]);
			
			for(int i=2;i<nums.length;i++) {
				dp[i] = Math.max(nums[i] + dp[i-2],dp[i-1]);
			}
			
			return dp[dp.length-1];
		}

		private int robTB(int[] nums,int[] dp,int i) {
			// TODO Auto-generated method stub
			if(i>=nums.length) return 0;
			
			if(dp[i] != -1 ) {
				return dp[i];
			}
			
			int rob = nums[i] + robTB(nums,dp,i+2);
			int Dont_rob = robTB(nums,dp,i+1);
			
			return dp[i] = Math.max(rob, Dont_rob);
			
		}
		
		
	}
}
