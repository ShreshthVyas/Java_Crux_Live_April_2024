package Lecture26;

public class AxisandOrbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bannab";
		int odd =0;
		int even =0;
		
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; axis-orbit>=0 && axis+orbit<s.length(); orbit++) {
				if(s.charAt(axis-orbit) != s.charAt(orbit+axis)) {
					break;
				}
				odd++;
			}
		}
		
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; axis-orbit>=0 && axis+orbit<s.length(); orbit++) {
				if(s.charAt((int)(axis-orbit)) != s.charAt((int)(orbit+axis))) {
					break;
				}
				odd++;
			}
		}
		
		System.out.println(odd+even);
		
	}

}
