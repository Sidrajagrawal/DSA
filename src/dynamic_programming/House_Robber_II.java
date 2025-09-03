package dynamic_programming;
import java.util.*;
public class House_Robber_II {
	class Solution {
	    public int rob(int[] nums) {
	        if (nums.length == 1) return nums[0];
	        int case1 = robLinear(Arrays.copyOfRange(nums, 0, nums.length - 1));
	        int case2 = robLinear(Arrays.copyOfRange(nums, 1, nums.length));
	        return Math.max(case1, case2);
	    }
	    private int robLinear(int[] nums) {
	        int n = nums.length;
	        if (n == 0) return 0;
	        if (n == 1) return nums[0];
	        int[] dp = new int[n];
	        dp[0] = nums[0];
	        dp[1] = Math.max(nums[0], nums[1]);
	        for (int i = 2; i < n; i++) {
	            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
	        }
	        return dp[n - 1];
	    }
	}
}