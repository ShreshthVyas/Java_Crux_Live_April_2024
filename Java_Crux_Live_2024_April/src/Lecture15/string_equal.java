package Lecture15;

public class string_equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hello";
		String s2 = new String("hello");
		
		System.out.println(s.equals(s2));
	}
	
	public boolean check(String s, String s2) {
		if(s.length()!=s2.length()){
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}
	

}
