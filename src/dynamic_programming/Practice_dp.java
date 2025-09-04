package dynamic_programming;

import java.util.*;

public class Practice_dp {
	class Solution {
	    public int lengthOfLIS(int[] nums) {
	    	return LIS(nums);
	    }

		private int LIS(int[] arr) {
			// TODO Auto-generated method stub
			int[] LIS = new int[arr.length];
			Arrays.fill(LIS, 1);
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i-1; j>=0; j--) {
					if(arr[i] > arr[j]) {
						int l = LIS[j];
						LIS[i] = Math.max(l+1, LIS[i]);
					}
				}
			}
			
			int max = LIS[0];
			for(int i=0;i<LIS.length;i++) {
				max = Math.max(max, LIS[i]);
			}
			
			return max;
		}
	}
}
