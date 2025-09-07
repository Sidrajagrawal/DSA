package backtracking;
import java.util.*;

public class Sudoku_Solver {
	class Solution {
	    public void solveSudoku(char[][] board) {
	        
	    	solve(board,0,0);
	    }

		private void solve(char[][] board, int row, int col) {
			// TODO Auto-generated method stub
			if(col == board[0].length) {
				row++;
				col=0;
			}if(row == board.length) {
				return;
			}
			if(board[row][col] != '.') { 
				solve(board,row,col+1);
			}else {
				for(int val=1;val<=9;val++) {
					if(isSafe(board,row,col,val)) {
						board[row][col] = (char) val;
						solve(board,row,col+1);
						board[row][col] = '.';
					}
				}
			}
		}


		private boolean isSafe(char[][] board, int row, int col, int val) {
			// TODO Auto-generated method stub
			char ch = (char) (val + '0');
			//row
			for(int i=0;i<board[0].length;i++) {
				if(board[row][i] == ch) {
					return false;
				}
			}
			//col
			for(int i=0;i<board.length;i++) {
				if(board[i][col] == ch) {
					return false;
				}
			}
			
			//Matrix check
			int startRow = row - row % 3;
		    int startCol = col - col % 3;
		    for (int i = startRow; i < startRow + 3; i++) {
		        for (int j = startCol; j < startCol + 3; j++) {
		            if (board[i][j] == ch) {
		                return false;
		            }
		        }
		    }
			
			
			
			return true;
		}
	}
}
