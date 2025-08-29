package recursion;
import java.util.*;

public class PowerSet {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		int l = (int)Math.pow(2, arr.length);
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int num =0; num<l; num++) {
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<arr.length; i++) {
				if( (num&(1<<i)) !=0 ) {
					list.add(arr[i]);
				}
			}
			
			ans.add(list);
		}
		
		System.out.print(ans);
	}
}
