package recursion;

public class test {
	class Solution {
	    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
	        int n = nums.length;
	        boolean[] ans = new boolean[n];
	        for(int x=1; x<=n; x++){
	            int[] temp = new int[n];
	            for(int j=0;j<nums.length;j++){
	                temp[j] = Math.min(nums[j],x);
	            }
	            Boolean[][] dp = new Boolean[n][k + 1];
	            if(check(temp,k,0,0,dp)){
	                ans[x-1]=true;
	            }
	        }
	        return ans;
	    }
	    public boolean check(int[] arr,int k,int sum,int i,Boolean[][] dp){
	    	if (i == arr.length) {
                return sum == k;
            }
            if (sum > k) {  
                return false;
            }
            if (dp[i][sum] != null) {
                return dp[i][sum];
            }
            boolean res = check(arr, k, sum, i + 1, dp) || 
                          check(arr, k, sum + arr[i], i + 1, dp);

            return dp[i][sum] = res;
	    }
	}
}
