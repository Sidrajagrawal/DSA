package recursion;

public class Coin_Toss {
	public static void main(String args[]) {
		int n = 3;
		System.out.println(toss(n,""));
	}

	private static int toss(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		int lc = toss(n-1,ans+"H");
		int rc = toss(n-1,ans+"T");
		return lc+rc;
	}
}
