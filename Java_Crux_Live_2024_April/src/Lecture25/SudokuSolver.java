package Lecture25;

import java.util.Arrays;

public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		
		sudoku(grid,0,0);
	}

	public static void sudoku(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		if(col==9) {
			row++;
			col =0;
		}
		if(row==9) {
			Display(grid);
			return;
		}
		if(grid[row][col]!=0) {
			sudoku(grid, row, col+1);
		}
		else {
			for (int val = 1; val<=9; val++) {
				if(isValid(grid,row,col,val)) {
					grid[row][col] =val;
					sudoku(grid, row, col+1);
					grid[row][col] =0;
				}
			}
		}
	}

	public static boolean isValid(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		//row
		for (int i = 0; i < 9; i++) {
			if(grid[i][col]== val) {
				return false;
			}
		}
		//col
		for (int i = 0; i < 9; i++) {
			if(grid[row][i]== val) {
				return false;
			}
		}
		
		//square
		int r = row - row%3;
		int c = col -col%3;
		for (int i = r; i < r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}

	public static void Display(int[][] grid) {
		// TODO Auto-generated method stub
		for (int[] a : grid) {
			System.out.println(Arrays.toString(a));
		}
	}

}
