package cp;
import java.util.*;

public class Halloumi_Boxes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] box = new int[n];
			for(int j=0;j<n;j++) {
				box[j] = sc.nextInt();
			}
			
			if(k==1) {
				boolean sorted = true;
				for(int j=1;j<n;j++) {
					if(box[j] < box[j-1]) {
						sorted = false;
						break;
					}
				}
				System.out.println(sorted?"YES":"NO");
			}else {
				System.out.println("YES");
			}
			
		}
	}
}
