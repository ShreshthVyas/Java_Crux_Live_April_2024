package Lecture20;

public class Subsequence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		subseq(s,"");
	}

	public static void subseq(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		subseq(ques.substring(1), ans+ch); //inclusion
		subseq(ques.substring(1), ans);//exclude
	}

}
