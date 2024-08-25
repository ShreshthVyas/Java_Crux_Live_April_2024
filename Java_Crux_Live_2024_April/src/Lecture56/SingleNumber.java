package Lecture56;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,3,2,1,4,7,6,5,6,5};
		System.out.println(singleNumber(arr));
	}

	public static int singleNumber(int[] nums) {
		int xor = 0;
		for (int i : nums) {
			xor = xor ^ i;
		}
		return xor;
	}

}
