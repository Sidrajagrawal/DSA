package recursion;
import java.util.*;

public class Practice_recursion {
	public static void main(String args[]) {
		int n = 3;
		int t = 3;
		path(n,t,0,"");
	}

	private static void path(int n,int t,int curr,String ans) {
		// TODO Auto-generated method stub
		if(curr == t) {
			System.out.println(ans);
			return;
		}
		if(curr > t) {
			return;
		}
		for(int i=1;i<=3;i++) {
			path(n,t,curr+i,ans+i);
		}
	}
}
