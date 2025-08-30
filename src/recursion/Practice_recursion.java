package recursion;
import java.util.*;

public class Practice_recursion {
	public static void main(String args[]) {
		int[] arr = {2,31,4,5,6,3,7};
		int key = 3;
		System.out.println(search(arr,key,0));
	}

	private static int search(int[] arr,int key,int idx) {
		if(idx == arr.length) return -1;
		
		if(arr[idx] == key ) return idx;
		
		int res = search(arr,key,idx+1);
		return res;
	}
}
