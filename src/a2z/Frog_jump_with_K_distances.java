package a2z;
import java.util.*;

public class Frog_jump_with_K_distances {
	
    public static int frogJump(int[] heights, int k) {
        int[] dp = new int[heights.length];
        Arrays.fill(dp,-1);
    	return solve(heights, k, 0,dp);
        
    }
    public static int solve(int[] heights, int k, int idx, int[] dp){
        if(idx == heights.length-1){
            return 0;
        }
        if(dp[idx]!= -1) return dp[idx];
        
        int minenergy = Integer.MAX_VALUE;
        for(int i=idx+1; i<=idx+k && i<heights.length; i++){
        	int jumpenergy = Math.abs(heights[idx] - heights[i]) + solve(heights, k, i,dp);
        	minenergy = Math.min(minenergy, jumpenergy);
        }
        return dp[idx] = minenergy;
    }
	
	public static void main(String[] args) {
		int[] height = {10, 5, 20, 0, 15};
		int k=2;
		System.out.println(frogJump(height,k));
	}

}
