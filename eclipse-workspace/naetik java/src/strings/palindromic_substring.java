package strings;

public class palindromic_substring {

	public static void main(String[] args) { // n^2 time complexity
		//concept name axis orbit by monu bhaiya 
		String s = "naan";
		System.out.println(axis_orbit(s));
		
		
	}

	public static int axis_orbit(String s) {
		//odd
		int odd = 0;
		for(int axis = 0 ; axis<s.length(); axis++) {
			for(int orbit = 0; axis-orbit>=0 && axis+orbit < s.length(); orbit++) {
				if(s.charAt(axis-orbit) != s.charAt(axis+orbit)) {
					break;
				}
				odd++;
			}
				
		}
		//even
		int even = 0;
		for(double axis = 0.5 ; axis<s.length(); axis++) {
			for(double orbit = 0.5; axis-orbit>=0 && axis+orbit < s.length(); orbit++) {
				if(s.charAt((int) (axis-orbit)) != s.charAt((int) (axis+orbit))) {
					break;
				}
				even++;
			}
		
		}
		return even+odd;
	}
}
//leetcode number 647 palindromic substring  
//longest palindromic substring 
