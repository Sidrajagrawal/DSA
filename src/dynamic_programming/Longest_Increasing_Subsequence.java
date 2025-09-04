package dynamic_programming;
import java.util.*;

public class Longest_Increasing_Subsequence {
	class Solution {
	    public int lengthOfLIS(int[] nums) {
	    	return LIS(nums);
	    }
		private int LIS(int[] nums) {
			// TODO Auto-generated method stub
			int[] lis = new int[nums.length];
			Arrays.fill(lis, 1);	
			for(int i=0;i<nums.length;i++) {
				for(int j=i-1;j>=0;j--) {
					if(nums[i] > nums[j]) {
						int l = lis[j];
						lis[i] = Math.max(lis[i], l+1);
					}
				}
			}
			System.out.println(Arrays.toString(lis));
			int max = lis[0];
			for(int i=0;i<lis.length;i++) {
				max = Math.max(max, lis[i]);
			}
			return max;
		}
	}
}

//[10,9,2,5,3,7,101,18] = [1, 1, 1, 2, 2, 3, 4, 4]
//[0,1,0,3,2,3] = [1, 2, 1, 3, 3, 4]
//[7,7,7,7,7,7,7] = [1, 1, 1, 1, 1, 1, 1]
