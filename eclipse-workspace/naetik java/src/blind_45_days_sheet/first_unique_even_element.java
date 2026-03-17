package blind_45_days_sheet;

import java.util.*;

public class first_unique_even_element {

	public static int main(String[] args) {
		int[] arr = { 3, 4, 2, 5, 4, 6 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && map.get(arr[i]) == 1) {
				return arr[i];
			}
		}
		return -1;

	}

}
