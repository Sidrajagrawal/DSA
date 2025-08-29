package recursion;

public class Coin_Toss_I {
	public static void main(String args[]) {
		int n = 3;
		System.out.println(toss(n,""));
	}

	private static int toss(int n,String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		
		int count = 0;
		
		if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H') {
			count += toss(n-1,ans+"H");
		}
		count += toss(n-1,ans+"T");
		return count;
		
	}
}
