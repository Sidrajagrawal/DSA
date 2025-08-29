package linkedList;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] vrr = arr;
		vrr[0] = 100;
		System.out.println(arr[0]);
	}
}
