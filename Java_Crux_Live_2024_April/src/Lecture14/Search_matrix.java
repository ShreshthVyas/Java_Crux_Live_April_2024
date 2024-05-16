package Lecture14;

public class Search_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = {{1,2,3},
						{5,6,7},
						{8,9,10}};
		System.out.println(optimisedsearch(arr, 1));
		
	}
	public static boolean search(int arr[][], int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(target==arr[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean optimisedsearch(int arr[][], int target) {
		int row = 0;
		int col = arr[0].length-1;
		
		while(row<arr.length && col>=0) {
			if(arr[row][col] == target) {
				return true;
			}
			if(arr[row][col] < target) {
				row++;
			}
			else {
				col--;
			}
		}
		return false;
	}

}
