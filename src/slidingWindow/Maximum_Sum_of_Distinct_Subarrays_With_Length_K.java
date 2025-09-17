package slidingWindow;

import java.util.*;

public class Maximum_Sum_of_Distinct_Subarrays_With_Length_K {
//	class Solution {
	public static void main(String args[]) {
		int[] nums = {1,5,4,2,9,9,9};
		System.out.println(maximumSubarraySum(nums,3));
	}
	    public static long maximumSubarraySum(int[] nums, int k) {
	    	HashMap<Integer,Boolean> map = new HashMap<>();
	    	for(int ele : nums) {
	    		if(!map.containsKey(ele)) {
	    			map.put(ele,false);
	    		}
	    	}
	    	int sum = 0;
	    	int ans = 0;
	    	int i=0,c=0;
	    	while(i<k) {
	    		if(!map.get(nums[i])) {
		    		map.put(nums[i], true);
		    		sum += nums[i];
		    	}
	    		i++;
	    	}
	    	ans = sum;
	    	while(i<nums.length) {
	    		map.put(nums[i-k], false);
	    		if(!map.containsKey(nums[i])) {
		    		map.put(nums[i], true);
		    		sum += nums[i];
		    		sum -= nums[i-k];
		    		ans = Math.max(ans,sum);
		    	}
	    		i++;
	    	}
	  	    return ans;
	    }
//	}
}
