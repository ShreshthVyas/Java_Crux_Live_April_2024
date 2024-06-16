package Lecture26;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String s = "ESE";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == s.charAt(0)) {
					boolean ans = wrdsrch(s, i,j,arr,0);
					if(ans) {
						System.out.println(true);
						return;
					}
				}
			}
		}
		
		System.out.println(false);
	}

	public static boolean wrdsrch(String s, int i, int j, char[][] arr, int idx) {
		// TODO Auto-generated method stub
		if(idx == s.length()) {
			return true;
		}
		if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]!=s.charAt(idx)) {
			return false;
		}
		arr[i][j] = '*';
		int r [] = {0,0,1,-1};
		int c [] = {1,-1,0,0};
		
		for (int k = 0; k < c.length; k++) {
			boolean ans = wrdsrch(s, i+r[k], j+c[k], arr, idx+1);
			if(ans) {
				return true;
			}
		}
		arr[i][j] = s.charAt(idx);
		
		return false;
		
		
	}

}
