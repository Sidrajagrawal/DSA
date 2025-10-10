package a2z;

public class Subset_Sum_Problem {

	class Solution {

	    static Boolean isSubsetSum(int arr[], int sum) {
	        // code here
	        Boolean[][] dp = new Boolean[arr.length][sum+1];
	        return subset(arr,sum,0,dp);
	    }
	    public static boolean subset(int[] arr, int t, int idx, Boolean[][] dp){
	        if(t == 0) return true;
	        if(idx == arr.length) return false;
	        
	        if(dp[idx][t]!=null) return dp[idx][t];
	        
	        boolean pick = false;
	        if(arr[idx] <= t){
	            pick = subset(arr,t-arr[idx],idx+1,dp);
	        }
	        boolean npick = subset(arr,t,idx+1,dp);
	        return dp[idx][t] = pick || npick;
	        
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
