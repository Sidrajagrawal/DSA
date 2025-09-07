package backtracking;

public class Valid_Sudoku {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            return check(board, 0, 0);
        }

        private boolean check(char[][] board, int row, int col) {
            if (col == board[0].length) { 
            	row++;
                col = 0;
            }
            if (row == board.length) { 
                return true;
            }

            if (board[row][col] == '.') {
                return check(board, row, col + 1);
            } else {
                if (isSafe(board, row, col)) {
                    return check(board, row, col + 1);
                } else {
                    return false;
                }
            }
        }

        private boolean isSafe(char[][] board, int row, int col) {
            char ch = board[row][col];

            // row
            for (int i = 0; i < board[0].length; i++) {
                if (i != col && board[row][i] == ch) {
                    return false;
                }
            }

            // col
            for (int i = 0; i < board.length; i++) {
                if (i != row && board[i][col] == ch) {
                    return false;
                }
            }

            //Matrix
            int startRow = row - row % 3;
            int startCol = col - col % 3;
            for (int i = startRow; i < startRow + 3; i++) {
                for (int j = startCol; j < startCol + 3; j++) {
                    if ((i != row || j != col) && board[i][j] == ch) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
