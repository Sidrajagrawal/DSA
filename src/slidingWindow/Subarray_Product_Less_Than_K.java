00package slidingWindow;

public class Subarray_Product_Less_Than_K {
	class Solution {
	    public int numSubarrayProductLessThanK(int[] nums, int k) {
	        int si = 0, ei=0, p=1,ans=0;
	        while(ei<nums.length){
	            //grow
	            p = p*nums[ei];
	            
	            //shrink
	            while(p>=k && si <= ei){
	                p = p/nums[si];
	                si++;
	            }

	            //ans
	            ans = ans+(ei-si+1);  // Jitne Number of Window size hoga utna hi subarray banega
	            ei++;
	        }
	        return ans;
	    }
	}
}
