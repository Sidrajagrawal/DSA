package slidingWindow;
import java.util.*;

public class Fruit_Into_Baskets {
	class Solution {
		public int totalFruit(int[] fruits) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int si = 0, ei = 0, ans = 0;
			while (ei < fruits.length) {
				// Grow
				map.put(fruits[ei], map.getOrDefault(fruits[ei], 0) + 1);

				// Shrink
				while (map.size() >= 3) {
					map.put(fruits[si], map.get(fruits[si]) - 1);
					if (map.get(fruits[si]) == 0)
						map.remove(fruits[si]);
					si++;
				}

				// Ans
				ans = Math.max(ans, ei - si + 1);
				ei++;
			}
			return ans;
		}
	}
}