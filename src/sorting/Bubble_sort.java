package sorting;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,3,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr) {
		int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
	}

}
