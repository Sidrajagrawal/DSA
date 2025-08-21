package String;
import java.util.Arrays;

public class Duplicate {
    public static int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);  

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            while (nums[right] > (long) nums[left] * k) {
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return nums.length - maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 4,6 };
        int k = 2;
        int result = minRemoval(nums, k);
        System.out.println("Minimum elements to remove: " + result);
    }
}