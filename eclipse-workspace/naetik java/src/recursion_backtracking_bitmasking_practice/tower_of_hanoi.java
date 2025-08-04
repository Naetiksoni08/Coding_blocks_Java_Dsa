package recursion_backtracking_bitmasking_practice;

import java.util.*;

public class tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		tower(N, "A", "C", "B");

	}

	public static void tower(int n, String src, String hlp, String des) {
		if (n == 0) {
			return;
		}
		tower(n - 1, src, des, hlp);
		System.out.println("Moving ring " + n + " from " + src + " to " + des);
		tower(n - 1, hlp, src, des);
	}

}
