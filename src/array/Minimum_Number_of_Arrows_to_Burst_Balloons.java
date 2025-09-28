package array;

import java.util.*;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
	class Solution {
		public int findMinArrowShots(int[][] points) {
			Arrays.sort(points, (a, b) -> {
				return Integer.compare(a[0], b[0]);
			});

			int[] prev = points[0];
			int count = 1;
			for (int i = 1; i < points.length; i++) {
				int cs = points[i][0];
				int ce = points[i][1];
				int ps = prev[0];
				int pe = prev[1];
				if (cs > pe) { // Non-Overlapping
					prev = points[i];
					count++;
				} else { // Overlapping
					prev[0] = Math.max(ps, cs);
					prev[1] = Math.min(pe, ce);
				}
			}
			return count;
		}
	}
}
