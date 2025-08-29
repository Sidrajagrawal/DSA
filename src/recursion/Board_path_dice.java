package recursion;

public class Board_path_dice {
	public static void main(String args[]) {
		int n = 3;
		int target = 3;
		printPath(n,target,0,"");
	}
	
	public static void printPath(int n,int t,int curr,String ans ) {
		if(curr == t) {
			System.out.print(ans+" ");
			return;
		}if(curr > t) {
			return;
		}
		for(int i=1;i<=n;i++) {
			printPath(n,t,curr+i,ans+i);	
		}
		
	}
}
