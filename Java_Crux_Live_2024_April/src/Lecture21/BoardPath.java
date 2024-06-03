package Lecture21;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		bp2(0,n,"");
	}

	public static void bp(int sum, int n, String ans) {
		// TODO Auto-generated method stub
		if(sum == n) {
			System.out.println(ans);
			return;
		}
		if(sum>n) {
			return;
		}
		bp(sum+1, n, ans + "1");
		bp(sum+2, n, ans + "2");
		bp(sum+3, n, ans + "3");
	}
	public static void bp2(int sum, int n, String ans) {
		// TODO Auto-generated method stub
		if(sum == n) {
			System.out.println(ans);
			return;
		}
		if(sum>n) {
			return;
		}
		for (int i = 1; i <=n; i++) {
			bp2(sum+i, n, ans+i);
		}
	}

}
