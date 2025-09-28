package array;
import java.util.*;

public class Minimum_Discards_to_Balance_Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrivals = {10,4,3,6,4,5,6,1,4};
		int w = 7;
		int m=1;
		System.out.println(minArrivalsToDiscard(arrivals,w,m));
	}

	public static int minArrivalsToDiscard(int[] arrivals, int w, int m) {
		int i=0,j=0,k=0,ans=0;
		while(i<arrivals.length) {
			if (k == w - 1) {
				ans += ocr(m, w, i - (w - 1), i, arrivals);
				j++;
				i=j;
				k=0;
			}
			i++;
			k++;
		}
		return ans;
	}

	public static int ocr(int m, int w, int start, int end, int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int c=0;
		for (int i = start; i <= end; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else if(arr[i] != 0){
				int val = map.get(arr[i]);
				if(val >= m ) {
					arr[i] = 0;
					c++;
				}	
				map.put(arr[i], val + 1);
			}
		}
		return c;
	}

}
