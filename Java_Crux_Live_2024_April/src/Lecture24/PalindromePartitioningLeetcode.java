package Lecture24;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningLeetcode {
	static List<List<String>> list = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		palpart(ques, ll);
		System.out.println(list);
		System.out.println(ll);
	}
	public static void palpart(String ques,List<String> ll) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			List<String> temp = new ArrayList<>(ll);
			list.add(temp);
//			list.add(ll);
//			System.out.println(list);
//			System.out.println("........");
			return;
		}
		for (int i = 1; i <=ques.length(); i++) {
			String s = ques.substring(0,i);
			if(isPal(s)) {
				ll.add(s);
				palpart(ques.substring(i),ll);
				ll.remove(ll.size()-1);//backtracking
			}
			
		}
		
	}
	public static boolean isPal(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!= s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
