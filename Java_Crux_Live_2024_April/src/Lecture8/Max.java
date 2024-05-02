package Lecture8;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,2,6,9,11,3};
		int ans = max(arr);
		int ans1= max1(arr);
		System.out.println(ans);
		System.out.println(ans1);
		
	}
	public static int max(int arr[]) {
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>ans) {
				ans = arr[i];
			}
		}
		return ans;
	}
	public static int max1(int arr[]) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			ans = Math.max(ans, arr[i]);
		}
		return ans;
	}

}
