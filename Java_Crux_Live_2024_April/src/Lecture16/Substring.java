package Lecture16;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		s.substring(0);
		s.substring(1, 2);
		substring1(s);
		}
	public static void substring1(String s) {
		
		for (int i = 0; i < s.length(); i++) { //strating point
			for (int j = i+1; j <= s.length(); j++) {//ending pint (exclusive)
				System.out.println(s.substring(i,j));
			}
			
		}
		
	}

}
