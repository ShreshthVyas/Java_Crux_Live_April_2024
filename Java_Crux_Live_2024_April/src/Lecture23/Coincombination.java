package Lecture23;

public class Coincombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {2,3,5};
		int n =10;
		coinchange(coin,n,0,"",0);
	}

	public static void coinchange(int[] coin, int n, int sum, String ans,int idx) {
		// TODO Auto-generated method stub
		
		if(sum == n) {
			System.out.println(ans);
			return;
		}
		if(sum>n) {
			return;
		}
		
		for (int i = idx; i < coin.length; i++) {
			coinchange(coin, n, sum+ coin[i], ans+coin[i],i);
		}
	}

}
