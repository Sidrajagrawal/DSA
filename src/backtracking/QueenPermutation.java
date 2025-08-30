package backtracking;
import java.util.*;

public class QueenPermutation{
	public static void main(String args[]) {
		int n = 4;
		boolean [] board = new boolean[n];
		int tq = 2;
		Permutation(board,tq,"",0);
	}

	private static void Permutation(boolean[] board, int tq, String ans, int qpsf) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++) {
			if(board[i] == false) {
				board[i] = true;
				Permutation(board,tq, ans+"b"+i+"q"+qpsf, qpsf+1);
				board[i] = false; // undo, back-tracking 
			}
		}
	}
}
