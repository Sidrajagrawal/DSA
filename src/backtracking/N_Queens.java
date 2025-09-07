package backtracking;

import java.util.*;

public class N_Queens {
	class Solution {
		public List<List<String>> solveNQueens(int n) {
			boolean[][] board = new boolean[n][n];
			List<List<String>> ans = new ArrayList<>();
			Queen(board, n, 0, ans);
			return ans;
		}

		private void Queen(boolean[][] board, int tq, int row, List<List<String>> ans) {
			// TODO Auto-generated method stub
			if (tq == 0) {
				result(board, ans);
				return;
			}

			for (int col = 0; col < board[0].length; col++) {
				if (isSafe(board, row, col)) {
					board[row][col] = true;
					Queen(board, tq - 1, row + 1, ans);
					board[row][col] = false;
				}
			}

		}

		private boolean isSafe(boolean[][] board, int row, int col) {
			// TODO Auto-generated method stub
			for (int i = 0; i < row; i++) {
				if (board[i][col])
					return false;
			}

			for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
				if (board[i][j])
					return false;
			}

			for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
				if (board[i][j])
					return false;
			}

			return true;
		}

		private void result(boolean[][] board, List<List<String>> ans) {
			List<String> ll = new ArrayList<>();
			for (boolean[] a : board) {
				StringBuilder st = new StringBuilder();
				for (boolean ele : a) {
					if (ele)
						st.append("Q");
					else
						st.append(".");
				}
				ll.add(st.toString());
			}
			ans.add(ll);
		}
	}
}
