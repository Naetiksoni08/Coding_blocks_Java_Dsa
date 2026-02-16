package blind_45_days_sheet;

import java.util.*;

public class merge_adjacent_equal_elemnent_2 {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 1, 2 };
		System.out.println(adjacent(arr));
	}

	public static List<Long> adjacent(int[] arr) {
		Stack<Long> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			long curr = arr[i];
			while (!s.isEmpty() && s.peek() == curr) {
				curr = curr + s.pop();

			}
			s.push(curr);
		}
		return new ArrayList<>(s);

	}

}
