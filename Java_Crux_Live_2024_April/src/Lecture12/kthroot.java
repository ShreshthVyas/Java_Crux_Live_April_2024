package Lecture12;

public class kthroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10000;
		int k = 1;
		System.out.println(search(n, k));
	}
	
	public static int search(int n , int k) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		
		while(lo<=hi) {
			int mid = (hi+lo)/2;
			if(Math.pow(mid, k)<=n) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
	}

}
