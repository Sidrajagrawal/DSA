package dynamic_programming;

import java.util.*;
public class Triangle_Minimum_Path {
	class Solution {
	    public int minimumTotal(List<List<Integer>> triangle) {
	        List<int[]> dp = new ArrayList<>();
	        for(List<Integer> a: triangle){
	            int[] temp = new int[a.size()];
	            Arrays.fill(temp,-100000);
	            dp.add(temp);
	        }
	        return minPath(triangle,0,0,dp);
	    }
	    public static int minPath(List<List<Integer>> arr, int cr, int cc, List<int[]> dp){
	        if(cr >= arr.size() || cc>=arr.get(cr).size()) return Integer.MAX_VALUE;
	        if(cr == arr.size()-1) return arr.get(cr).get(cc);
	        if(dp.get(cr)[cc] != -100000) return dp.get(cr)[cc];
	        int diagonal = minPath(arr, cr+1,cc+1,dp);
	        int down = minPath(arr, cr+1,cc,dp);
	        return dp.get(cr)[cc] = arr.get(cr).get(cc) + Math.min(diagonal,down);
	    }
	}

}
