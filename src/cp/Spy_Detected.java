package cp;

import java.util.*;
public class Spy_Detected {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
			}
			
			int ele = arr[0],c1 = 0;
			int ans = 0 ,c2 = 0;
			for(int j=0 ;j<n; j++) {
				if(arr[j] == ele) {
					c1++;
				}else if(ans == 0) {
					ans = arr[j];
					c2++;
				}else {
					c2++;
				}
			}
			if(c1>c2) {
				for(int j=0;j<arr.length;j++) {
					if(arr[j] == ans ) {
						System.out.println(j+1);
						break;
					}
				}
			}else {
				for(int j=0;j<arr.length;j++) {
					if(arr[j] == ele ) {
						System.out.println(j+1);
						break;
					}
				}
			}
		}
	}
}
