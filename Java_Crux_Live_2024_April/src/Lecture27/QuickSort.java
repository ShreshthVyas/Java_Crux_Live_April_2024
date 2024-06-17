package Lecture27;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 7,6,5,4,3,2,1};
		quicksort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

	public static void quicksort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>=ei) {
			return;
		}
		
		int pivot  = partition(arr, si, ei);
		quicksort(arr, si, pivot-1);
		quicksort(arr, pivot+1, ei);
		
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
