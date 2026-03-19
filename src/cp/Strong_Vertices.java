package cp;

import java.util.*;
public class Strong_Vertices {
	class Pair{
		int diff,idx;
		Pair(int diff, int idx){
			this.diff = diff;
			this.idx = idx;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for(int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i=0; i<n; i++) {
				b[i] = sc.nextInt();
			}
			int last = -1;
			List<Pair> lst = new ArrayList<>();
			for(int i=0; i<n; i++) {
				lst.add(new Pair(Math.abs(a[i]-b[i]), i+1));
			}
			
		}
	}
}
