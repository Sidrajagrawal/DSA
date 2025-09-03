package dynamic_programming;

import java.util.*;

public class Uncrossed_Lines {
	class Solution {
		public int maxUncrossedLines(int[] numarr1, int[] numarr2) {
			return lcsBU(numarr1, numarr2);
		}

		private int lcsBU(int[] arr1, int[] arr2) {
			// TODO Auto-generated method stub
			int[][] dp = new int[arr1.length + 1][arr2.length + 1];
			for (int i = 1; i < dp.length; i++) {
				for (int j = 1; j < dp[0].length; j++) {
					if (arr1[i - 1] == arr2[j - 1]) {
						dp[i][j] = 1 + dp[i - 1][j - 1];
					} else {
						int f = dp[i - 1][j];
						int s = dp[i][j - 1];
						dp[i][j] = Math.max(f, s);
					}

				}

			}
			return dp[dp.length - 1][dp[0].length - 1];
		}
	}
}