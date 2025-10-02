package binarySearch;
import java.util.*;

public class Aggressive_Cows {

	   public int aggressiveCows(int[] stalls, int k) {
	        // code here
	        Arrays.sort(stalls);
	        int max = Integer.MIN_VALUE;
	        for(int ele : stalls){
	            max = Math.max(ele,max);
	        }
	        int lo = 0, hi = max, res=0;
	        
	        while(lo <= hi){
	            int mid = (lo + hi)/2;
	            
	            if(isPossible(mid,stalls,k)){
	                res = mid;
	                lo = mid+1;
	            }else{
	                hi = mid-1;
	            }
	        }
	        return res;
	    }
	    public static boolean isPossible(int min, int[] stalls, int k){
	        int curr = stalls[0]; 
	        int c = k-1;
	        for(int i = 1; i<stalls.length; i++){
	            if(stalls[i] - curr >= min){
	                curr = stalls[i];
	                c--;
	            }
	            if(c == 0) return true;
	        }
	        return c==0;
	    }

}
