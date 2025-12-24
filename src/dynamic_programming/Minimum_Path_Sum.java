package dynamic_programming;
import java.util.*;
public class Minimum_Path_Sum {
	class Solution {
		public int minPathSum(int[][] grid) {
			int[][] dp = new int[grid.length][grid[0].length];
			for (int[] a : dp) {
				Arrays.fill(a, -1);
			}
			return minPath(grid, 0, 0, dp);
		}
		public static int minPath(int[][] grid, int cr, int cc, int[][] dp) {
			if (cr >= grid.length || cc >= grid[0].length)
				return Integer.MAX_VALUE;
			if (dp[cr][cc] != -1)
				return dp[cr][cc];
			if (cr == grid.length - 1 && cc == grid[0].length - 1)
				return grid[cr][cc];
			int right = minPath(grid, cr, cc + 1, dp);
			int down = minPath(grid, cr + 1, cc, dp);
//			System.out.println(grid[cr][cc]);
			return dp[cr][cc] = grid[cr][cc] + Math.min(right, down);
		}
	}
}