package recursion;
import java.util.*;

public class Combination_Sum_II {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates); // sort first to handle duplicates
            List<Integer> ll = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            solve(candidates, target, ll, ans, 0);
            return ans;
        }

        private void solve(int[] nums, int amount, List<Integer> ll, List<List<Integer>> ans, int start) {
            if (amount == 0) {
                ans.add(new ArrayList<>(ll));
                return;
            }

            for (int i = start; i < nums.length; i++) {
                // skip duplicates
                if (i > start && nums[i] == nums[i - 1]) continue;

                if (amount >= nums[i]) {
                    ll.add(nums[i]);
                    int[] arr = new int[nums.length - (i + 1)];
                    int idx = 0;
                    for (int j = i + 1; j < nums.length; j++) {
                        arr[idx++] = nums[j];
                    }

                    solve(arr, amount - nums[i], ll, ans, 0);
                    ll.remove(ll.size() - 1);
                }
            }
        }
    }
}
