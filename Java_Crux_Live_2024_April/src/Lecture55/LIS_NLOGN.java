package Lecture55;

public class LIS_NLOGN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(arr));
		//0,1,0,3,2,3
		
	}
	public static int lengthOfLIS(int[] nums) {
	     int lis[] = new int[nums.length];
	     lis[0] = nums[0];
	     int ans =1;
	     for (int i = 1; i < nums.length; i++) {
			if(nums[i] > lis[ans-1]) {
				lis[ans] = nums[i];
				ans++;
			}
			else {
				int idx = BinarySearch(0,ans-1,lis,nums[i]);
				lis[idx] = nums[i];
			}
		}
	    return ans;
	     
	}
	private static int BinarySearch(int si, int ei, int[] lis,int target) {
		// TODO Auto-generated method stub
		
		int idx=0;
		while(si<=ei) {
			int mid = (si+ei)/2;
			if(lis[mid]>=target) {
				ei = mid-1;
				idx =mid;
			}
			else{
				si = mid+1;
			}
		}
		
		return idx;
	}

}
