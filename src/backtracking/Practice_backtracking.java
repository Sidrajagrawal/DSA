package backtracking;

public class Practice_backtracking {
	public static void main(String args[]) {
		int n = 4;
		int tq = 2;
		boolean[] board = new boolean[n];
		permutation(n,tq,board,"",0);
	}

	private static void permutation(int n, int tq, boolean[] board,String ans,int qpsf) {
		// TODO Auto-generated method stub
		if(tq == qpsf) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(board[i] == false) {				
				board[i] = true;
				permutation(n,tq,board,ans+"b"+i+"q"+qpsf,qpsf+1);
				board[i] = false;
			}
		}

	}
}
