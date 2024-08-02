package Lecture45;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	 public int[] intersection(int[] nums1, int[] nums2) {
	        HashSet<Integer>  temp = new HashSet<>();
	        HashSet<Integer>  ans = new HashSet<>();
	        
	        for (int i = 0; i < nums2.length; i++) {
				temp.add(nums1[i]);
			}
	        
	        for (int i = 0; i < nums2.length; i++) {
				if(temp.contains(nums2[i])) {
					ans.add(nums2[i]);
				}
			}
	        int arr[] = new int[ans.size()];
	        int idx =0;
	        for (int i : ans) {
				arr[idx] = i;
				idx++;
			}
	        
	        return arr;
	        
	 }

}
