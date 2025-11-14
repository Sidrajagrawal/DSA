package dynamic_programming;

public class Partitions_with_Given_Difference {
	class Solution {
		public int countPartitions(int[] arr, int diff) {
			// code here
			int sum = 0;
			for (int ele : arr)
				sum += ele;

			if (sum - diff < 0 || (sum + diff) % 2 != 0)
				return 0;

			int target = (sum + diff) / 2;
			Integer[][] dp = new Integer[arr.length][target + 1];
			return fun(arr, 0, target, dp);
		}

		public static int fun(int[] arr, int idx, int target, Integer[][] dp) {
			if (target == 0) {
				int zeros = 0;
				for (int i = idx; i < arr.length; i++)
					if (arr[i] == 0)
						zeros++;
				return 1 << zeros;
			}
			;
			if (idx == arr.length || target < 0)
				return 0;

			if (dp[idx][target] != null)
				return dp[idx][target];

			int a = 0;
			if (arr[idx] <= target)
				a = fun(arr, idx + 1, target - arr[idx], dp);
			int b = fun(arr, idx + 1, target, dp);
			return dp[idx][target] = a + b;
		}
	}

}
