package bitmasking;

public class Set_theory_VenDig {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5 };
		int n = 1000;
		venn_diagram(arr, n);

	}

	public static void venn_diagram(int[] arr, int n) {
		int l = arr.length;
		int count = 0;
		for (int i = 1; i < (1 << l); i++) {
			int ans = Power_Set(arr, n, i);
			if (Integer.bitCount(i) % 2 == 0)
				count -= ans;
			else
				count += ans;
		}
		System.out.println(count);
	}

	public static int Power_Set(int[] arr, int n, int i) {
		int ans = 1;
		int idx = 0;
		while (i > 0) {
			if ((i & 1) != 0)
				ans *= arr[idx];
			idx++;
			i >>= 1;
		}
		return n / ans;
	}
}
