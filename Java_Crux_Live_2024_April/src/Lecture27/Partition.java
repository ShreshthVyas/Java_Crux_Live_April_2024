package Lecture27;

import java.util.Arrays;

public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,5,2,6,7,3,4};
		int n = partition(arr,0,arr.length-1);
		System.out.println(n);
		System.out.println(Arrays.toString(arr));
		//array
		
	}

	public static int partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int item = arr[ei];
		int idx = si;
		for (int i = si; i < ei; i++) {
			if(arr[i]<item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[idx];
		arr[idx] = arr[ei];
		arr[ei] = temp;
		return idx;
	}

}
