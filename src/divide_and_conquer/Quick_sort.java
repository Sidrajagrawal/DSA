package divide_and_conquer;
import java.util.*;

public class Quick_sort {

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 1, 8, 3, 4};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int si, int ei) {
        if (si >= ei) {   
            return;
        }
        int idx = partition(arr, si, ei);
        sort(arr, si, idx - 1);
        sort(arr, idx + 1, ei);
    }

    private static int partition(int[] arr, int si, int ei) {
        int item = arr[ei]; // Pivot element
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                swap(arr, i, idx);
                idx++;
            }
        }
        swap(arr, ei, idx); 
        return idx;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
