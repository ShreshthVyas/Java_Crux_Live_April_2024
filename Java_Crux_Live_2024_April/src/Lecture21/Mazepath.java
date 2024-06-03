package Lecture21;

public class Mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		maze(1,1,3,"");
	}

	public static void maze(int cr, int cc, int n, String ans) {
		// TODO Auto-generated method stub
		if(cr == n && cc == n) {
			System.out.println(ans);
			return;
		}
		if(cr>n || cc>n ) {
			return;
		}
		maze(cr+1, cc, n, ans+"V");
		maze(cr, cc+1, n, ans+"H");
		
	}
	
	

}
