package dynamic_programming;
import java.util.*;
public class Minimum_Falling_Path_Sum {
	class Solution {
		public int minFallingPathSum(int[][] mat) {
			int[][] dp = new int[mat.length][mat[0].length];
			for (int[] a : dp)
				Arrays.fill(a, -66666);
			int ans = Integer.MAX_VALUE;
			for (int col = 0; col < mat[0].length; col++) {
				ans = Math.min(ans, minPath(mat, 0, col, dp));
			}
			return ans;
		}
		public static int minPath(int[][] mat, int cr, int cc, int[][] dp) {
			if (cr < 0 || cr >= mat.length || cc < 0 || cc >= mat[0].length)
				return Integer.MAX_VALUE;
			if (dp[cr][cc] != -66666)
				return dp[cr][cc];
			if (cr == mat.length - 1)
				return mat[cr][cc];
			int ld = minPath(mat, cr + 1, cc - 1, dp);
			int rd = minPath(mat, cr + 1, cc + 1, dp);
			int d = minPath(mat, cr + 1, cc, dp);
			return dp[cr][cc] = mat[cr][cc] + Math.min(d, Math.min(ld, rd));
		}
	}
}