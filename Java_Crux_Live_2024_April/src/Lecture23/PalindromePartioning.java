package Lecture23;

public class PalindromePartioning {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ques = "nitin";
		palpart(ques, "");
		
	}
	public static void palpart(String ques,String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <=ques.length(); i++) {
			String s = ques.substring(0,i);
			if(isPal(s)) {
				palpart(ques.substring(i),ans+s+'|');
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
