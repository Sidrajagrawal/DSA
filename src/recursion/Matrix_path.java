package recursion;
import java.util.*;

public class Matrix_path {
	public static void main(String args[]) {
		int [][] mat = new int[3][3];
		System.out.println(path(mat,0,0,""));
	}

	private static int path(int[][] mat, int i,int j, String path) {
		// TODO Auto-generated method stub
		if(i == mat.length-1 && j == mat[0].length-1) {
			System.out.println(path);
			return 1;
		}
		int count = 0;
		if(j<mat[0].length-1) {
			count += path(mat,i,j+1,path+"R");
		}
		if(i<mat.length-1) {
			count += path(mat,i+1,j,path+"D");	
		}
		return count ;
	}
}
