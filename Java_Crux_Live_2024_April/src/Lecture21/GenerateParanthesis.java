package Lecture21;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		genparanthesis(0,0,n,"");
	}

	public static void genparanthesis(int op, int cl, int n, String ans) {
		// TODO Auto-generated method stub
		if(op==n && cl==n) {
			System.out.println(ans);
			return;
		}
		if(op>n || cl>n) {
			return;
		}
		genparanthesis(op+1,cl,n,ans+"(");
		if(op>cl) {
			genparanthesis(op, cl+1, n, ans+")");
		}		
	}

}
