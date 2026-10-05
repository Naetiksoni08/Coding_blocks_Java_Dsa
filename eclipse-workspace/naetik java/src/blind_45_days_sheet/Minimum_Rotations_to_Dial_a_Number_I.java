package blind_45_days_sheet;

public class Minimum_Rotations_to_Dial_a_Number_I {
	public static void main(String[] args) {
		String s = "0192837465";
		int initial = 0;
		int total = 0;
		for (char ch : s.toCharArray()) {
			int digit = ch - '0';
			int diff = Math.abs(initial - digit);
			int dist = Math.min(diff, 10 - diff);
			total += dist;
			initial = digit;

		}
		System.out.println(total);
	}

}

// ek circular dial hai theek hai 0,1,2,3,4,5,6,7,8,9 theek hai ab maanle mujhe mai abhi 0 par hu aur 9 par jana hai toh do option hai ki mai clockwise jau ya anticlockwise 
// clockwise gaya toh fir a-b yani 0-9 = 9 steps lagenge 
// anticlockwise gaya toh fir 10 total digit minus a-b ka diff so 10-0-9 = 10-9 = 1 step bilkul correct kyuki 9 is adjacent to 0
// so dono mai sai joh bhi minimum hai uuse total mai add kardo bas yeh dist wali joh line hai yeh 10  - wala forumula works for anticlockwise baki clockwise toh simple a-b kardo
//Do points ek circle (size 10) pe hain. Unke beech ki doori ke do raaste hain: ek seedha (|a-b|), ek ghoom ke (10 - |a-b|).
//Dono mein jo chhota hai, wahi answer hai. "Clockwise/anticlockwise" ka label matter nahi karta — bas dono raaste nikaalo aur min lo.