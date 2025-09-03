package dynamic_programming;
import java.util.*;

public class Longest_Common_Subsequence {
	class Solution {
	    public int longestCommonSubsequence(String text1, String text2) {
	    	int[][] dp = new int[text1.length()][text2.length()];
	    	for(int[] a:dp) {
	    		Arrays.fill(a, -1);
	    	}
	    	
//	    	return lcsTD(text1,text2,0,0,dp);
	    	return lcsBU(text1,text1);
	    }

		private int lcsBU(String s1, String s2) {
			// TODO Auto-generated method stub
			int[][] dp = new int[s1.length()+1][s2.length()+1];
			for(int i=1;i<dp.length;i++) {
				for(int j=1;j<dp[0].length;j++) {
					if(s1.charAt(i-1) == s2.charAt(j-1)) {
						dp[i][j] = 1 + dp[i-1][j-1];
					}else {
						int f = dp[i-1][j];
						int s = dp[i][j-1];
						dp[i][j] = Math.max(f, s);
					}
					
				}
			}
			
			return dp[dp.length-1][dp[0].length-1];
		}

		private int lcsTD(String s1, String s2,int i,int j,int[][]dp) {
			// TODO Auto-generated method stub
			if(i==s1.length() || j == s2.length()) {
				return 0;
			}
			
			if(dp[i][j] !=-1) {
				return dp[i][j];
			}
			
			int ans=0;
			if(s1.charAt(i) == s2.charAt(j)) {
				ans = 1+lcsTD(s1,s2,i+1,j+1,dp);
			}else {
				int f = lcsTD(s1,s2,i+1,j,dp);
				int s = lcsTD(s1,s2,i,j+1,dp);
				ans = Math.max(f, s);
			}
			
			return dp[i][j] = ans;
		}
	}
}
