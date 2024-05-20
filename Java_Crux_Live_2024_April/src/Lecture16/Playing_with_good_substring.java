package Lecture16;

public class Playing_with_good_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaeicdeeoeoeaio";
		int count  =0;
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i))) {
				count++;
			}
			else {
				ans = Math.max(ans, count);
				count =0;
			}
		}
		ans = Math.max(ans, count);
		System.out.println(ans);
	}

	public static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		if(ch == 'a' || ch == 'e' || ch=='i'|| ch == 'o'|| ch=='u') {
			return true;
		}
		return false;
	}

}
