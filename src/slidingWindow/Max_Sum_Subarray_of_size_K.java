package slidingWindow;

public class Max_Sum_Subarray_of_size_K {
	class Solution {
	    public int maxSubarraySum(int[] arr, int k) {
	    	int sum = 0;
	    	int ans = 0 ;
	    	for(int i=0;i<k;i++) {
	    		sum+=arr[i];
	    	}
	    	ans = sum;
	    	for(int i=k;i<k;i++) {
	    		sum += arr[i];
	    		sum -= arr[i-k];
	    		ans = Math.max(ans, sum);)
	    	}
	        
	    }
	}
}
