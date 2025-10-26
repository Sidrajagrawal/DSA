package dynamic_programming;

import java.util.*;

public class Partition_Equal_Subset_Sum {
	class Solution {
		public boolean canPartition(int[] nums) {
			int s = 0;
			for (int ele : nums)
				s += ele;
			if (s % 2 != 0)
				return false;
			int target = s / 2;
			Boolean[][] dp = new Boolean[nums.length][target + 1];
			return fun(nums, target, 0, dp);
		}

		public static boolean fun(int[] arr, int target, int idx, Boolean[][] dp) {
			if (target == 0)
				return true;
			if (idx == arr.length || target < 0)
				return false;

			if (dp[idx][target] != null)
				return dp[idx][target];
			boolean include = fun(arr, target - arr[idx], idx + 1, dp);
			boolean exclude = fun(arr, target, idx + 1, dp);0 dp[idx][target] = include || exclude;
		}
	}
}
