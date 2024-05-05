package Lecture9;

public class RainwaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		int leftmax[]= new int[height.length];
		int rightmax[]= new int[height.length];
		leftmax[0] = height[0];
		
		for (int i = 1; i < rightmax.length; i++) {
			leftmax[i] = Math.max(leftmax[i-1], height[i]);
		}
		
		rightmax[rightmax.length-1] = height[height.length-1];
		
		for (int i = rightmax.length-2; i>=0; i--) {
			rightmax[i] = Math.max(height[i], rightmax[i+1]);
		}
		
		int sum =0;
		
		for (int i = 0; i < height.length; i++) {
			sum+= Math.min(leftmax[i], rightmax[i]) -height[i];
		}
		System.out.println(sum);
		
		
	}

}
