package dynamic_programming;

public class FibonacciWithDp {
    public static void main(String args[]) {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println("Normal Recursion: " + fib(n));
        System.out.println("Top-Down DP: " + fibTd(n, dp));
        System.out.println("Bottom-Up DP: " + fibBu(n));
    }

    //Bottom-Up Recursion
    private static int fibBu(int n) {
    	int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<dp.length; i++) {
        	dp[i] = dp[i-1] + dp[i-2];
        }
		return dp[n];
	}

	// Top-down with memoization (DP)
    private static int fibTd(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int f1 = fibTd(n - 1, dp);
        int f2 = fibTd(n - 2, dp);  
        return dp[n] = f1 + f2;
    }

    // Simple recursion (without DP)
    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fib(n - 1);
        int f2 = fib(n - 2);  
        return f1 + f2;
    }
}
