package array;

public class Smallest_Absent_Positive_Greater_Than_Average {
	class Solution {
	    public int smallestAbsent(int[] nums) {
	        int sum = 0, max = Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            max = Math.max(max,nums[i]);
	            sum += nums[i];
	        }
	        int avg = sum/nums.length,ans = 0;
	        for(int i=1;i<105;i++){
	            boolean flag = true;
	            for(int j=0;j<nums.length;j++){
	                if(nums[j] == i){
	                    flag = false;
	                    break;
	                }
	            }
	            if(flag){
	                if(i > avg){
	                    ans = i;
	                    break;
	                }
	            }
	        }
	        return ans;
	    }
	}
}
