package backtracking;

public class Wine_Problem {
	public static void main(String[] args) {
		int[] wine = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
//		System.out.println(maximum_profitTD(wine, 0, wine.length - 1, 1,dp));
		System.out.println(maximum_profitBU(wine));
	}
	
	public static int maximum_profitBU(int[] wines) {
		int[][] dp = new int[wines.length][wines.length];
		int year = wines.length;
		for(int i=0; i<dp.length; i++) {
			dp[i][i] = wines[i] * year;
		}
		year--;
		for(int gap=1; gap<dp.length; gap++) {
			for(int j=gap; j<dp.length; j++) {
				int i = j-gap;
				int fs = wines[i] * year + dp[i-1][j];
				int ls = wines[j] * year + dp[i][j-1]; 
			}
			year--;
		}
		return dp[0][dp.length-1];
	}
	
	public static int maximum_profitTD(int[] wine, int i, int j, int year,int[][]dp) {
		if (i > j) {
			return 0;
		}
		if(dp[i][j] != 0) {
			return dp[i][j];
		}
		int fs = wine[i] * year + maximum_profitTD(wine, i + 1, j, year + 1,dp);
		int ls = wine[j] * year + maximum_profitTD(wine, i, j - 1, year + 1,dp);
		return dp[i][j] = Math.max(fs, ls);
	}
}
