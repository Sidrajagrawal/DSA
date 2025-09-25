package slidingWindow;

import java.util.*;

public class Sliding_Subarray_Beauty {

	public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] ans = new int[nums.length - k + 1];
		int l = 0, idx = 0;
		for (int r = 0; r < nums.length; r++) {
			// Grow
			int a = nums[r];
			if (a < 0) {
				map.put(a, map.getOrDefault(a, 0) + 1);
			}

			// Shrink
			if (r - l + 1 > k) {
				int left = nums[l];
				if(left<0) {
					map.put(left, map.get(left)-1);
					if(map.get(left) == 0) {
						map.remove(left);
					}
				}
				l++;

			}

			// Ans
			if (r - l + 1 == k) {
				int val = kth(map, x);
				ans[idx++] = val;
			}

		}
		return ans;
	}

	private static int kth(HashMap<Integer, Integer> map, int x) {
		int count = 0;
		for (int i = -50; i < 0; i++) {
			if (map.containsKey(i)) {
				count += map.get(i);
			}
			if (count >= x) {
				return i;
			}

		}
		return 0;

	}

	public static void main(String[] args) {
		int[] arr = { -3, 1, 2, -3, 0, -3 };
		System.out.println(Arrays.toString(getSubarrayBeauty(arr, 2, 1)));
	}

}
