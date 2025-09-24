package slidingWindow;

import java.util.*;

public class Maximum_Sum_of_Distinct_Subarrays_With_Length_K {
	class Solution {
		public static long maximumSubarraySum(int[] nums, int k) {
			long ans = 0, windowSum = 0;
			HashMap<Integer, Integer> map = new HashMap<>();

			int left = 0;
			for (int right = 0; right < nums.length; right++) {
				int val = nums[right];
				map.put(val, map.getOrDefault(val, 0) + 1);
				windowSum += val;

				if (right - left + 1 > k) {
					int removeVal = nums[left++];
					map.put(removeVal, map.get(removeVal) - 1);
					if (map.get(removeVal) == 0)
						map.remove(removeVal);
					windowSum -= removeVal;
				}

				if (right - left + 1 == k && map.size() == k) {
					ans = Math.max(ans, windowSum);
				}
			}

			return ans;
		}
	}
}
