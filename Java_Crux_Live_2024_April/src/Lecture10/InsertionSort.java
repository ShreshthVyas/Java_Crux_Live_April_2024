package Lecture10;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,1,4,2,3,5};
		
		for (int i = 1; i < arr.length; i++) {
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1] = arr[j];
				j--;
			}
			j++;
			arr[j]=item;	
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
