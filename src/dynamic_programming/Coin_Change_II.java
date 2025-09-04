package dynamic_programming;
import java.util.*;

public class Coin_Change_II {
	class Solution {
	    public int change(int amount, int[] coins) {
	    	int[][] dp  = new int[amount+1][coins.length];
	    	for(int[] a: dp) {
	    		Arrays.fill(a, -1);
	    	}
//	        return Coin_change( coins, amount,0,dp);
	    	return Coin_changeBU(coins,amount);
	    }

		private int Coin_changeBU(int[] coins, int amount) {
			// TODO Auto-generated method stub
			int[][] dp = new int[amount+1][coins.length];
			for(int i=0;i<dp.length;i++) {
				dp[i][0] = 1;
			}
			return 0;
		}

		private int Coin_change(int[] coins, int amount, int i,int[][] dp) {
			// TODO Auto-generated method stub
			if(amount == 0) return 1;
			if(i==coins.length) return 0;
			if(dp[amount][i]!=-1) {
				return dp[amount][i];
			}
			int inc=0,exc=0;
			if(amount >= coins[i]) {
				inc = Coin_change(coins,amount-coins[i],i,dp);
			}
			exc = Coin_change(coins,amount-coins[i],i+1,dp);
			return dp[amount][i] = inc+exc;
		}
	}
}
