package cp;
import java.util.*;

public class Cut_the_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0; x<t; x++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			boolean flag = false;
			for (int l=0;l<n-2 && !flag; l++) {
				for (int r=l+1; r<n-1; r++) {
			    	if(getSum(l,r,arr)) {
			    		System.out.println( (l+1) + " "+ (r+1));
			    		flag = true;
			    		break;
			    	}
			    }
			}
			
			if(!flag) {
				System.out.println(0 + " "+ 0);
			}
			
		}
	}

	private static boolean getSum(int l, int r, int[] arr) {
		// TODO Auto-generated method stub
		int s1=0,s2=0,s3=0;
		for(int i = 0; i <= l-1; i++) {
			s1+=arr[i];
		}
		for(int i = l; i <= r-1; i++) {
			s2+=arr[i];
		}
		for(int i = r; i < arr.length; i++) {
			s3+=arr[i];
		}
		s1 = s1%3;
		s2 = s2%3;
		s3 = s3%3;
		
		if(s1 == s2 && s2 == s3) {
			return true;
		}else if(s1 != s2 && s2 != s3 && s1!=s3) {
			return true;
		}
		return false;
	}

}
