package Lecture8;

public class Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,5,3,1};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void reverse(int arr[]) {
		int i =0;
		int j = arr.length -1;
		while(i<=j) {
			int temp = arr[i];
			arr[i] =arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
	}

}
