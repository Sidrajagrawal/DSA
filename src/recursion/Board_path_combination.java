package recursion;
import java.util.*;

public class Board_path_combination {
	public static void main(String args[]) {
		int n = 3;
		int target = 4;
		solve(n,target,0,"",1);
	}

	private static void solve(int n,int t,int curr,String ans,int idx) {
		// TODO Auto-generated method stub
		if(curr == t) {
			System.out.println(ans);
			return;
		}
		if(curr > t) return;
		
		for(int i=idx; i<=n;i++) {
			solve(n,t,curr+i,ans+i,i);
		}
	}
}
