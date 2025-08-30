package recursion;
import java.util.*;

public class Matrix_path {
	public static void main(String args[]) {
		int m = 3;
		int n=3;
		System.out.println(path(m-1,n-1,0,0,""));
	}

	private static int path(int m,int n, int i,int j, String path) {
		// TODO Auto-generated method stub
		if(i == m && j == n) {
			System.out.println(path);
			return 1;
		}
		int count = 0;
		if(j<n) {
			count += path(m,n,i,j+1,path+"R");
		}
		if(i<m) {
			count += path(m,n,i+1,j,path+"D");	
		}
		return count ;
	}
}
