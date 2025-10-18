package graph;

import java.util.*;

public class Matrix_01 {
	class Pair {
		int row, col, dis;

		Pair(int row, int col, int dis) {
			this.row = row;
			this.col = col;
			this.dis = dis;
		}
	}

	class Solution {
		public int[][] updateMatrix(int[][] mat) {
	    	int n = mat.length;
	    	int m = mat[0].length;
	    	Queue<Pair> q = new LinkedList<>();
	    	boolean[][] visited = new boolean[n][m];
	    	int[][] ans = new int[n][m];
	    	
	    	for(int i=0; i<n; i++) {
	    		for(int j =0; j<m; j++) {
	    			if(mat[i][j] == 0) q.add(new Pair(i,j,0));
	    		}
	    	}
	    	int[] drow = {-1, 0, 1, 0};
	    	int[] dcol = {0, 1, 0, -1};
	    	while(!q.isEmpty()) {
	    		//Remove
	    		int r = q.peek().row;
	    		int c = q.peek().col;
	    		int dis = q.peek().dis;
	    		q.remove();
	    		//Ignore
	    		if(visited[r][c]) continue;
	    		//Marks as visited
	    		visited[r][c] = true;
	    		//Self work
	    		ans[r][c] = dis;
	    		//Add unvisited nbrs
	    		for(int i=0; i<4; i++) {
	    			int nrow = r+drow[i];
	    			int ncol = c+dcol[i];
	    			if(nrow >=0 && nrow < n && ncol >= 0 && ncol < m && !visited[nrow][ncol]) {
	    				q.add(new Pair(nrow,ncol,dis+1));
	    			}
	    		}
	    	}
	    	return ans;
	    }
	}
}
