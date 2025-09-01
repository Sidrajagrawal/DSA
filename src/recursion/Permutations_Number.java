package recursion;
import java.util.*;

public class Permutations_Number {
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<Integer> ll = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            solve(nums, ll, ans);
            return ans;
        }

        private void solve(int[] nums, List<Integer> ll, List<List<Integer>> ans) {
            if (nums.length == 0) {
                ans.add(new ArrayList<>(ll));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                int val = nums[i];
                ll.add(val);

                // Create new array excluding nums[i]
                int[] arr = new int[nums.length - 1];
                int idx = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (j != i) {
                        arr[idx++] = nums[j];
                    }
                }

                solve(arr, ll, ans);
                ll.remove(ll.size() - 1);
            }
        }
    }
}
