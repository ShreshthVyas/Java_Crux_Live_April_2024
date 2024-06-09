package Lecture24;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		int noq =2;
		boolean board[] = new boolean[n];
		queen(board,0,noq,"");
	}

	public static void queen(boolean[] board, int cq, int noq, String ans) {
		// TODO Auto-generated method stub
		if(cq == noq) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < board.length; i++) {
			if(board[i] == false) {
				board[i] = true;
				queen(board, cq+1, noq, ans+"q"+cq+"b"+i);
				board[i] = false; // Backtracking
			}
		}
	}

}
