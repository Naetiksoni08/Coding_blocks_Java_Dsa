package blind_45_days_sheet;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows_spoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(); // no of stalls
			int c = sc.nextInt(); // no of cows
			int[] stalls = new int[n];
			for (int i = 0; i < stalls.length; i++) {
				stalls[i] = sc.nextInt();
			}
			Arrays.sort(stalls);
			System.out.println(Aggressive_cows(stalls, c));
		}
	}

	public static int Aggressive_cows(int[] stalls, int cows) {
		int ans = 0;
		int low = 0;
		int high = stalls[stalls.length - 1] - stalls[0]; // 9-1 = found hidden search space from 0 to 8
		while (low <= high) {
			int mid = (low + high) / 2;
			if (isitpossible(stalls, cows, mid) == true) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;

			}

		}
		return ans;
		// the interviewer will ask you ki the array was sorted thats why u applied
		// binary search on it u will say no sir the hidden search space we finded out
		// that was sorted (0-8) that is why applied binary search to it

	}

	private static boolean isitpossible(int[] stalls, int noc, int mid) {
		int cow = 1;
		int position = stalls[0]; // phele stall pr cow joh bethi hai usse yaad karlia
		for (int i = 1; i < stalls.length; i++) {
			if (stalls[i] - position >= mid) { // abhi wale stall ki value - joh phele wale stall kia valu ka diff agar	// greater than ya equalt o mid hota toh betha dp (yeh kese nikala kyuki
				// current stall pr cow bithane ki dependency current -1 wale yani phele
				// jaha pr ek cow ko bethaya uspar thi isliye we made a variable for
				// postion
				cow++;
				position=stalls[i]; //aur ab joh recent wale stall par cow bethi hai uska position yaad karlo
				

			}
			if(cow==noc) { // cow++ karte karte aisa na hua ho ki current cow desired cow ke equal hogai ho
				return true;
			}

		}

		return false;
	}

}//time complexity - nlogn
