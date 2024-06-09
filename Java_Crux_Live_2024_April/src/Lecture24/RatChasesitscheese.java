package Lecture24;

import java.util.Scanner;

public class RatChasesitscheese {
	static boolean flag = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char [][] board = new char[n][m];
		for (int i = 0; i < board.length; i++) {
			String s = sc.next();
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = s.charAt(j);
			}
		}
		int ans [][] = new int[n][m];
		
		rat(board, ans, 0,0,n,m);
		System.out.println("...");
		Display(ans);
		
		if(!flag) {
			System.out.println("NO PATH FOUND");
		}
	}

	public static void rat(char[][] board, int[][] ans, int cr, int cc, int n, int m) {
		// TODO Auto-generated method stub
		if(cr==n-1 && cc == m-1 && board[cr][cc]!='X') { //positive base case
			flag =true;
			ans[cr][cc] = 1;
			Display(ans);
			return;
		}
		if(cr>=n|| cc>=m || cr<0 ||cc<0 || board[cr][cc] == 'X') { //-ve base case
			return;
		}
		ans[cr][cc] = 1;
		board[cr][cc] = 'X';
		rat(board, ans, cr+1, cc, n, m);
		rat(board, ans, cr, cc+1, n, m);
		rat(board, ans, cr-1, cc, n, m);
		rat(board, ans, cr, cc-1, n, m);
		ans[cr][cc] = 0;
		board[cr][cc] = 'O';
		
	}
	
	public static void Display(int arr[][]) {
		for(int a[] : arr ) {
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
