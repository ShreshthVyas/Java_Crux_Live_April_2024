package Lecture9;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		int left[] = new int[arr.length];
		int right[] =  new int [arr.length];
		
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] =  arr[i-1]*left[i-1];
		}
		right[right.length-1] = 1;
		for (int i = right.length-2;i>=0; i--) {
			right[i] = right[i+1]*arr[i+1];
		}
		int ans[] =  new int[arr.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] =left[i]*right[i];
			System.out.print(ans[i]+" ");
		} 
	}

}
