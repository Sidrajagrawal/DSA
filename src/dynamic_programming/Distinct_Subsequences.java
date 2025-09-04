package dynamic_programming;
import java.util.*;

public class Distinct_Subsequences {
	class Solution {
	    public int numDistinct(String s, String t) {
            int[][]dp = new int[s.length()][t.length()];
            for(int[] a: dp){
                Arrays.fill(a,-1);
            }
	    	return Distinct(s,t,0,0,dp);
	    }

		private int Distinct(String s, String t, int i, int j,int[][] dp) {
			// TODO Auto-generated method stub
			if(j==t.length()) return 1;
			if(i==s.length()) return 0;
            if(dp[i][j] != -1){
                return dp[i][j];
            }
			
			int inc = 0, exc=0;
			if(s.charAt(i) == t.charAt(j)) {
				inc = Distinct(s,t,i+1,j+1,dp);
			}
			exc = Distinct(s,t,i+1,j,dp);
			return dp[i][j] = inc+exc;
		}
	}
}
