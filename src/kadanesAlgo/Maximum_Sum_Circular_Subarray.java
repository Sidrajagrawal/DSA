package kadanesAlgo;

public class Maximum_Sum_Circular_Subarray {

	class Solution {
	    public int maxSubarraySumCircular(int[] nums) {
	        int tsum = 0;
	        for (int ele : nums) tsum += ele;

	        // Max Sum (Kadane’s for max)
	        int sum = 0;
	        int max = Integer.MIN_VALUE;
	        for (int ele : nums) {
	            sum += ele;
	            max = Math.max(max, sum);
	            if (sum < 0) sum = 0;
	        }

	        // Min Sum (Kadane’s for min)
	        sum = 0;
	        int min = Integer.MAX_VALUE;
	        for (int ele : nums) {
	            sum += ele;
	            min = Math.min(min, sum);
	            if (sum > 0) sum = 0; // fixed
	        }

	        // If all elements are negative, return max
	        if (max < 0) return max;

	        int cMSum = tsum - min;
	        return Math.max(max, cMSum);
	    }
	}


}
