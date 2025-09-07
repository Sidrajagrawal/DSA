package backtracking;

import java.util.Scanner;

public class Practice_backtracking {
	class Solution {
		public boolean exist(char[][] board, String word) {
			return path(board, word, 0, 0, 0);
		}
	}

	private static boolean path(char[][] board, String word, int cr, int cc, int idx) {
		// TODO Auto-generated method stub
		if (cr < 0 || cc < 0 || cr >= board.length - 1 || cc >= board[0].length - 1
				|| board[cc][cr] != word.charAt(idx) || board[cr][cc] == '#') {
			return false;
		}

		if (idx == word.length()) {
			return true;
		}

		char temp = board[cr][cc];

		board[cr][cc] = '#';

		boolean found = path(board, word, cr, cc + 1, idx + 1) || path(board, word, cr + 1, cc, idx + 1)
				|| path(board, word, cr, cc - 1, idx + 1) || path(board, word, cr - 1, cc, idx + 1);

		board[cr][cc] = temp;

		return found;
	}
}
