package array;

import java.util.Arrays;

public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
	      int n = matrix.length;
	      int m = matrix[0].length;
	      int[][] arr = new int[n][m];
	      for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            arr[j][n-i-1] = matrix[i][j];
	        }
	      }

	      for(int i = 0; i<n; i++) {
	    	  for(int j = 0; j<m ; j++) {
	    		  matrix[i][j] = arr[i][j];
	    	  }
	      }
	      
	}
	

}
