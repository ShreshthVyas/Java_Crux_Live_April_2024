package Lecture58;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2,1,1,0,1,2,1,9,4,5,6,9,7,8,1,0,4,6};
		
		int max = Arrays.stream(arr).max().getAsInt();
		
		
		int freq[] =  new int[max+1];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		
		for (int i = 1; i < freq.length; i++) {
			freq[i] = freq[i-1] + freq[i];
		}
		int ans[] = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			int idx = freq[arr[i]];
			ans[idx-1] = arr[i];
			freq[arr[i]]--;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
