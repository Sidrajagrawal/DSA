package bitmasking;

public class Single_Number_III {
	class Solution {
		public int[] singleNumber(int[] nums) {
			int xor = 0;
			int[] ans = new int[2];
			int idx = 0;
			for (int i = 0; i < nums.length; i++) {
				xor ^= nums[i];
			}
			int mask = (xor & ~(xor - 1)); // Main item finding first set bit from back side
			int g1 = 0, g2 = 0;
			for (int i = 0; i < nums.length; i++) {
				if ((nums[i] & mask) == 0) {
					g1 ^= nums[i];
				} else {
					g2 ^= nums[i];
				}
			}
			ans[0] = g1;
			ans[1] = g2;
			return ans;
		}
	}
}
