package dynamic_programming;
import java.util.*;

public class Geek_Training {
	class Solution {
	    public int maximumPoints(int arr[][]) {
	        // code here
	        int[][] dp = new int[arr.length][3];
	        for(int[] a: dp){
	            Arrays.fill(a,-1);
	        }
	        
	        return fun(arr,0,-1,dp);
	    }
	    public static int fun(int[][] arr, int dayIdx, int lastIdx, int[][] dp){
	        if(dayIdx >= arr.length) return 0;
	        if(lastIdx != -1 && dp[dayIdx][lastIdx]!=-1) return dp[dayIdx][lastIdx];
	        int maxi = 0;
	        for(int i=0; i<3; i++){
	            if(i != lastIdx){
	                maxi = Math.max(maxi, arr[dayIdx][i] + fun(arr, dayIdx+1, i,dp));
	            }
	        }
	        if (lastIdx != -1)
	            dp[dayIdx][lastIdx] = maxi;

	        return maxi;
	    } 
	}

}
