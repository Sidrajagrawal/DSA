package cp;
import java.util.*;

public class Practice_cp {
	public static void main(String args[]){
		int[] arr = {1,2,30,-4,5};
		int[] temp =Arrays.copyOfRange(arr, 1, arr.length-1);
		System.out.println(Arrays.toString(temp));
		
	}
}
