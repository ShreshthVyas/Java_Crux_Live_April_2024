package Lecture8;

public class Swap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int brr[] = {7,8,6,5,4,9};
		System.out.println(arr[0] + " " + brr[0]);
		System.out.println(".....");
		swap(arr,brr);
		System.out.println(arr[0] + " " + brr[0]);
	}
	
	public static void swap(int arr[],int brr[]) {
		int temp[] = arr;
		arr= brr;
		brr = temp;
	}
	}


