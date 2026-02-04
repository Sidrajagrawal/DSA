package math;

import java.util.*;

public class I_Coins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] p = new double[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextDouble();
		}
		double[][] dp = new double[((n + 1) / 2) + 1][n + 1];
		for (double[] arr : dp)
			Arrays.fill(arr, -1);
		System.out.print(probability(p, (n + 1) / 2, 0, dp));
	}

	public static double probability(double[] p, int h, int i, double[][] dp) {
		if (h == 0)
			return 1;
		if (i == p.length)
			return 0;

		if (dp[h][i] != -1)
			return dp[h][i];

		double head = p[i] * probability(p, h - 1, i + 1, dp);
		double tail = (1.0 - p[i]) * probability(p, h, i + 1, dp);
		return dp[h][i] = head + tail;
	}

}
