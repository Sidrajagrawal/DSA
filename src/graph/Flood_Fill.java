package graph;

import java.util.*;

public class Flood_Fill {
	class Solution {
		class Pair {
			int row, col;

			Pair(int row, int col) {
				this.row = row;
				this.col = col;
			}
		}

		public int[][] floodFill(int[][] image, int sr, int sc, int color) {
			int n = image.length;
			int m = image[0].length;

			Queue<Pair> q = new LinkedList<>();
			boolean[][] visited = new boolean[n][m];

			int startColor = image[sr][sc];
			if (startColor == color)
				return image;

			q.add(new Pair(sr, sc));

			int[] drow = { -1, 0, 1, 0 };
			int[] dcol = { 0, 1, 0, -1 };

			while (!q.isEmpty()) {
				// Remove
				int r = q.peek().row;
				int c = q.peek().col;
				q.remove();

				// Ignore
				if (visited[r][c])
					continue;

				// Marked as Visited
				visited[r][c] = true;

				// self work
				image[r][c] = color;

				// Add unvisited nbrs
				for (int i = 0; i < 4; i++) {
					int nrow = r + drow[i];
					int ncol = c + dcol[i];
					if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !visited[nrow][ncol]
							&& image[nrow][ncol] == startColor) {
						q.add(new Pair(nrow, ncol));
					}
				}
			}
			return image;
		}
	}
}
