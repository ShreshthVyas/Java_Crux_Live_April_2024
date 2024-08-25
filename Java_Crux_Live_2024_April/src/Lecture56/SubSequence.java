package Lecture56;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		subsequence(s);
	}

	private static void subsequence(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		
		for (int i = 0; i < (1<<n); i++) {
			print(s,i);
		}
			
	}

	private static void print(String s, int i) {
		// TODO Auto-generated method stub
		int pos =0;
		while(i>0) {
			if((i&1) == 1) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i>>=1;// drop 1 bit
		}
		System.out.println();
	}
	

}
