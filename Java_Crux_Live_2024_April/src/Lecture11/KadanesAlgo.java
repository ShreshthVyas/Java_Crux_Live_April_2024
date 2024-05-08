package Lecture11;

public class KadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,-1,7,8};
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum =0;
			}
		}
		System.out.println(ans);
	}

}
