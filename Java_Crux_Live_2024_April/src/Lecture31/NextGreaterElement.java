package Lecture31;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] =  {4, 2, 6, 7, 8, 1, 9, 10, 19, 3};
		Stack<Integer> st = new Stack<>();
		int ans[] = new int[arr.length];
		
		for (int i = 0; i < ans.length; i++) {
			while(!st.isEmpty() && arr[i]> arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
