package blind_45_days_sheet;

public class Nim_Game {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(n % 4 != 0); // i win and Agar n % 4 == 0 → tum haar jaoge
		// pattern i can pick 1,2,3 stones at a time
//	n = 1 → Win
//	n = 2 → Win
//	n = 3 → Win
//  n = 4 → Lose
//	n = 5 → Win
//	n = 6 → Win
//  n = 7 → Win
//	n = 8 → Lose
		// so har 4 ke multiple par i will loose tc will be o(1) and sc will be o(1)..

		// This is a generalized concept, and the formula for this concept is this
		// Player 1 se K stones hata sakta hai
		// n % (K+1) == 0
	}

}
