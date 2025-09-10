package backtracking;
import java.util.*;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = {2,11,3};
		int[] girls = {5, 7, 3, 2};
		Arrays.sort(boys);
		Arrays.sort(girls);
		int[][] dp = new int[boys.length][girls.length];
		System.out.println(Valentine(boys,girls,0,0,dp));
	}

	private static int Valentine(int[] boys, int[] girls, int i, int j,int[][] dp) {
		// TODO Auto-generated method stub
		if(i == boys.length) {
			return 0;
		}
		if(j == girls.length) {
			return 1000001;
		}
		if(dp[i][j] != 0) {
			return dp[i][j];
		}
		
		int set = Math.abs(boys[i] - girls[j]) + Valentine(boys,girls,i+1,j+1,dp);
		int rej =  Valentine(boys,girls,i,j+1,dp);
		
		return dp[i][j] = Math.min(set, rej);
	}
	

}
