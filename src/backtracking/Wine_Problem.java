package backtracking;

public class Wine_Problem {
	public static void main(String[] args) {
		int[] wine = { 2, 3, 5, 1, 4 };
		System.out.println(maximum_profit(wine, 0, wine.length - 1, 1));
	}

	public static int maximum_profit(int[] wine, int i, int j, int year) {
		if (i > j) {
			return 0;
		}
		int fs = wine[i] * year + maximum_profit(wine, i + 1, j, year + 1);
		int ls = wine[j] * year + maximum_profit(wine, i, j - 1, year + 1);
		return Math.max(fs, ls);
	}
}
