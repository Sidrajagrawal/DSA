package math;

import java.util.Arrays;

public class construct_rectangle {
	public static void main(String args[]) {
		int area = 12;
		int sqrt = (int)Math.sqrt(area);
		int small = Integer.MAX_VALUE;
		int [] ans = new int[2];
		for(int i=1;i<=sqrt;i++) {
			int l = area%i == 0 ? area/i : -1;
			if(l!=-1 && l>=i && l-i <= small) {
				small = l-i;
				ans[0] = l;
				ans[1] = i;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}
