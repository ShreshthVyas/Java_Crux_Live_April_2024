package Lecture11;

public class MaxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5,4,-1,7,8};
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int sum =arr[i];
			max = Math.max(max, sum);
			for (int j = i+1; j < arr.length; j++) {
				sum+= arr[j];
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
		
	}

}
