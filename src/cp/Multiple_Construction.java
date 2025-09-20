package cp;

import java.util.*;
public class Multiple_Construction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
			int n = sc.nextInt();
			int[] ans = new int[2*n];
			int i = 0;
			for(int x=n; x>0; x--) {
				if(ans[i] == 0) {
					ans[i] = x;
				}
				if(ans[i+x] == 0) {
					ans[i+x] = x;
					i++;
				}else {
					int j=2;
					while(j*x < 2*n) {
						if(ans[i+j*x]==0) {
							ans[i+j*x] = x;
							i++;
							break;
						}
						j++;
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for (int num : ans) {
                sb.append(num).append(" ");
            }
			System.out.println(sb.toString().trim());
		}
	}
}
