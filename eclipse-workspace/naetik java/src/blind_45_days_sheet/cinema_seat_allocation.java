package blind_45_days_sheet;

import java.util.*;

public class cinema_seat_allocation {
	public static void main(String[] args) {
		int n = 3;
		int[][] reservedSeats = { { 1, 2 }, { 1, 3 }, { 1, 8 }, { 2, 6 }, { 3, 1 }, { 3, 10 } };
		System.out.println(cinema_seat(n, reservedSeats));
	}

	public static int cinema_seat(int n, int[][] reservedSeats) {
		HashMap<Integer, Set<Integer>> reserved = new HashMap<>();
		for (int[] a : reservedSeats) {
			int row = a[0];
			int seatno = a[1];
			reserved.computeIfAbsent(row, k -> new HashSet<>()).add(seatno); // 1 -> 2
		}

		long totalGroups = 2L * n; // greedy assume every row is empty so 2 blocks per row

		for (int key : reserved.keySet()) {
			Set<Integer> seats = reserved.get(key);

			boolean Ablock = isitfree(seats, 2, 3, 4, 5);
			boolean Bblock = isitfree(seats, 4, 5, 6, 7);
			boolean Cblock = isitfree(seats, 6, 7, 8, 9);

			int canFit = 0;
			if (Ablock) {
				canFit++;
				if (Cblock)
					canFit++;
			} else if (Cblock) {
				canFit++;
			} else if (Bblock) {
				canFit++;
			}
			totalGroups += (canFit - 2); // because we had assume that each block is empty so we are just adjusting back
											// to actual value

		}
		return (int) totalGroups;
	}

	private static boolean isitfree(Set<Integer> seats, int s1, int s2, int s3, int s4) {
		return !seats.contains(s1) && !seats.contains(s2) && !seats.contains(s3) && !seats.contains(s4);
	}
}
