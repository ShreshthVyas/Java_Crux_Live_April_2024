package Lecture27;

public class PwerLogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =3;
		int b = 4;
		System.out.println(pow(a,b));
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return 1;
		}
		int ans = pow(a,b/2);
		ans= ans*ans;
		if(b%2!=0) {
			ans = ans*a;
		}
		return ans;
	}

}
