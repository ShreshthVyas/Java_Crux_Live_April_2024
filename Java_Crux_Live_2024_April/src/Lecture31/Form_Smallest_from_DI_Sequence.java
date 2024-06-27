package Lecture31;

import java.util.Arrays;
import java.util.Stack;

public class Form_Smallest_from_DI_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IDDIIDDI";
		int ans[] = new int[s.length()+1];
		Stack<Integer> st = new Stack<>();
		int c =1;
		for (int i = 0; i <=s.length(); i++) {
			
			if(i==s.length() || s.charAt(i)=='I') {
				ans[i]= c++;
				while(!st.isEmpty()) {
					ans[st.pop()] = c++;
				}
			}
			else {
				st.push(i);
			}
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
