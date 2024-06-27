package Lecture31;

import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{0,1,1,0,0},{0,0,1,1,0},{0,0,0,0,0},
				{0,0,1,0,1},{1,1,1,1,1}};
		
		int ans = CelebrityProb(arr);
		
		if(ans==-1) {
			System.out.println("NO Celeb");
		}
		else {
			System.out.println(ans);
		}
	}

	private static int CelebrityProb(int[][] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		
		while(st.size()>1) {
			int a = st.pop();
			int b = st.pop();
			if(arr[a][b] == 1) {
				st.push(b);
			}
			else {
				st.push(a);
			}
		}
		
		int celeb = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if(i == celeb) {
				continue;
			}
			if(arr[i][celeb] == 0 || arr[celeb][i] == 1) {
				return -1;
			}
		}
		
		return celeb;
	}

}
