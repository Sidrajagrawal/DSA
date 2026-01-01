package cp;

import java.util.*;

public class div_II {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			int[] z = new int[n];
			for (int i= 0; i< n; i++) x[i] = sc.nextInt();
			for (int i=0; i<n; i++) y[i] = sc.nextInt();
			for (int i=0; i <n; i++) z[i] = sc.nextInt();
			long c_ab = 0;
			for (int j =0; j <n; j++) {
				boolean check = true;
				for (int i =0; i <n; i++) {
					if (x[i] >= y[(i+j) % n]) {
						check= false;
						break;
					}
				}
				if (check) c_ab++;
			}
			long c_bc = 0;
			for (int j =0; j <n; j++) {
				boolean check = true;
				for (int i = 0; i < n; i++) {
					if (y[i]>= z[(i + j) % n]) {
						check = false;
						break;
					}
				}
				if (check) c_bc++;
			}
			long res =c_ab*c_bc*n;
			System.out.println(res);
		}
	}
}