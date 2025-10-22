package blind_45_days_sheet;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Tower_of_hanoi(n, "A", "C", "B");

	}

	public static void Tower_of_hanoi(int n, String src, String hlp, String des) {
		if(n==0) {
			return;
		}
		Tower_of_hanoi(n - 1, src, des, hlp); // move starting ke n-1 disk to hlp // and we said ki src sai utha ke hlp par rakhdo aur koi bhi help if u want u can take from des rod
		System.out.println("Move " + n + "th disk from " + src + " to " + des);
		Tower_of_hanoi(n - 1, hlp, src, des); // move all the n-1 disk from helper to des and if u need anyhelp u can take from src
	}

}
