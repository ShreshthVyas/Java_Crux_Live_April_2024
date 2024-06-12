package Lecture25;

import java.util.Iterator;

public class NqueenProblem {
	static int count  =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		boolean board[][] = new boolean[n][n];
		nqueen(board,n,0);
		System.out.println(count);
	}

	public static void nqueen(boolean[][] board, int n, int row) {
		// TODO Auto-generated method stub
		if(n==0) {
			count++;
			Display(board);
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if(isValid(board,row,col)) {
				board[row][col] =true;
				nqueen(board, n-1, row+1);
				board[row][col] =false;//backtracking
			}
		}
		
	}

	public static boolean isValid(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		//lower half , right , left need not be checked
		
		// up
		for (int i = row; i>=0; i--) {
			if(board[i][col]) {
				return false;
			}
		}
		
		//upper left
		int cr =row; int cc =col;
		while(cr>=0 && cc>=0) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc--;
		}
		
		//upper right
		cr = row; cc =col;
		while(cr>=0 && cc<board.length) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc++;
		}
		
		return true;
	}

	public static void Display(boolean [][] board) {
		// TODO Auto-generated method stub
		for (boolean[] bs : board) {
			for(boolean b: bs) {
				if(b) {
					System.out.print("Q ");
				}
				else {
					System.out.print(". ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}

}
