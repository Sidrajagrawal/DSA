package dynamic_programming;
import java.util.*;

public class Number_of_Longest_Increasing_Subsequence {
	class Solution {
	    public int findNumberOfLIS(int[] nums) {
	        return LIS(nums);
	    }

		private int LIS(int[] arr) {
			// TODO Auto-generated method stub
			int[] lis = new int[arr.length];
			Arrays.fill(lis, 1);
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i-1;j>=0;j--) {
					if(arr[i] > arr[j]) {
						int l = lis[j];
						lis[i] = Math.max(lis[i], l+1);
					}
				}
			}
			
			int max = lis[0];
			for(int ele : lis) {
				max = Math.max(ele, max);
			}
			int count_max = 0;
			for(int ele:lis) {
				if(max == ele) count_max++;
			}
			return count_max;
		}
	}
}
