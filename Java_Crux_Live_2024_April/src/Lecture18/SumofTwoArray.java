package Lecture18;

import java.util.ArrayList;
import java.util.Collections;

public class SumofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 9,9,9,1};
		int brr[] = {7,8};
		ArrayList<Integer> list =  new ArrayList<>();
		int carry =0;
		int i = arr.length-1;
		int j = brr.length-1;
		
		while(i>=0 && j>=0) {
			int sum = arr[i]+ brr[j] + carry;
			list.add(sum%10);
			carry = sum/10;
			i--;
			j--;		
		}
		if(arr.length>brr.length) { // j<0 
			while(i>=0) {
				int sum = arr[i] + carry;
				list.add(sum%10);
				carry = sum/10;
				i--;
			}
			
		}
		else {
			while(j>=0) {
				int sum = brr[j] + carry;
				list.add(sum%10);
				carry = sum/10;
				j--;
			}		
		}
		
		if(carry>0) {
			list.add(carry);
		}
		Collections.reverse(list);
		System.out.println(list);
	}

}
