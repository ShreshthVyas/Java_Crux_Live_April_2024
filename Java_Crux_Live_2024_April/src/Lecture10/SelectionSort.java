package Lecture10;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-1,2,3,-2,12};
		
		for (int i = 0; i < arr.length; i++) {
			int minidx = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minidx]) {
					minidx =j;
				}
			}
			int t = arr[i];
			arr[i] = arr[minidx];
			arr[minidx] = t;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
