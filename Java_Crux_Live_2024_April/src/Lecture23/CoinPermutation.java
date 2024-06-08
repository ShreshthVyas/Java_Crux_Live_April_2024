package Lecture23;

public class CoinPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {2,3,5};
		int n =10;
		coinchange(coin,n,0,"");
	}

	public static void coinchange(int[] coin, int n, int sum, String ans) {
		// TODO Auto-generated method stub
		
		if(sum == n) {
			System.out.println(ans);
			return;
		}
		if(sum>n) {
			return;
		}
		
		for (int i = 0; i < coin.length; i++) {
			coinchange(coin, n, sum+ coin[i], ans+coin[i]);
		}
		
	}

}
