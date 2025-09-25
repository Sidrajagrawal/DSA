package cp;

import java.util.*;
public class Unconventional_Pairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int i=0,j=1;
			int ans = Integer.MIN_VALUE;
			while(j<arr.length) {
				int val =  Math.abs(arr[i] - arr[j]);
				ans = Math.max(ans, val);
				j=j+2;
				i=i+2;
			}
			System.out.println(ans);
		}

	}

}
