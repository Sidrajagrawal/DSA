package dynamic_programming;

public class FibonacciWithDp {
	public static void main(String args[]) {
		int n=5;
		int[] dp = new int[n+1];
		System.out.println(fib(n));
		System.out.println(fibTd(n,dp));
	}
	private static int fibTd(int n,int []dp) {
		// TODO Auto-generated method stub
		if(n == 0 || n==1) {
			return n;
		}
		
		if(dp[n]!=0) {
			return dp[n];
		}
		
		int f1 = fibTd(n-1,dp);
		int f2 = fibTd(n-1,dp);
		
		return dp[n] = f1+f2;
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n == 0 || n==1) {
			return n;
		}
		int f1 = fib(n-1);
		int f2 = fib(n-1);
		return f1+f2;
	}
}
