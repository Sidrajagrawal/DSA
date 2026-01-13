package bitmasking;


public class Odd_Even {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 10, 111, 101, 115, 112 };
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & 1) == 0) {
				System.out.println(arr[i]+" Even");
			} else {
				System.out.println(arr[i]+" Odd");
			}
		}
	}

}
// ... 2^3 * 2^2 * 2^1 * 2^0
// if 2^0 is there means odd otherwise even because 2^0 = 1 which make it odd
// That's why we check n&1==0--> Even because 1001(9) & 0001 --> 1&1 = 1 so it's odd and yes 9 is odd proof