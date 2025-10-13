package dynamic_programming;
import java.util.*;

public class Climbing_Stairs {
	class Solution {
	    public int climbStairs(int n) {
	        int[] dp = new int[n+1];
	        return solve(n,dp);
	    }
	    public static int solve(int n, int[] dp){
	        if(n == 0) return 1;
	        if(dp[n] != 0) return dp[n];
	        int l =0, r=0;
	        if(n>=1) l=solve(n-1,dp);
	        if(n >= 2) r=solve(n-2,dp);
	        return dp[n] =l+r; 
	    }
	}
}
