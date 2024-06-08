package Lecture23;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {
	static List<List<String>> list  = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		palpart(s,new ArrayList<>());
		
		System.out.println(list);
		
	}

	public static void palpart(String ques,List<String> ll) {
		// TODO Auto-generated method stub
		if(ques.length() == 0) {
			list.add(ll);
			return;
		}
		
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0,i);
			if(isPal(s)) {
				ll.add(s);
				palpart(ques.substring(i), ll);
			}
		}
		
	}
	public static boolean isPal(String s) {
		int i = 0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
