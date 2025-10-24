package dynamic_programming;
import java.util.*;

public class Practice_dp {
	public static void main(String[] args) {
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}}; 
		int[][] dp = new int[arr.length][arr[0].length];
		for(int [] a: dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(AllPossiblePath(arr,0,0,0,dp));
	}

	private static int AllPossiblePath(int[][] arr, int cr, int cc, int sum,int[][]dp) {
		if(cr >= arr.length || cc >= arr[0].length || arr[cr][cc] == -1) return Integer.MAX_VALUE;
		if(dp[cr][cc] != -1) return dp[cr][cc];
		
		if(cr == arr.length-1 && cc == arr[0].length-1) {
			return sum+arr[cr][cc];
		}
		
		int temp = arr[cr][cc];
		arr[cr][cc] = -1;
		int right = AllPossiblePath(arr,cr,cc+1,sum+temp,dp);
		int down = AllPossiblePath(arr,cr+1,cc,sum+temp,dp);
		arr[cr][cc] = temp;
		
		return dp[cr][cc] = Math.min(right, down);
	}
}
