package Lecture11;

public class FirstBadversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int firstBadVersion(int n) {
	        int i = 1;
	        int j = n;
	        int ans=0;
	        while(i<=j){
	            int mid = i + (j-i)/2;
	            if(isBadVersion(mid) == true){
	                ans = mid;
	                j = mid-1;
	            }
	            else{
	                i = mid+1;
	            }
	        }  
	        return ans;
	    }
	    public static boolean isBadVersion(int n){
	    	return false;
	    }

}
