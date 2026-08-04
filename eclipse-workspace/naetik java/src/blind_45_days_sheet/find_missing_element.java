package blind_45_days_sheet;

import java.util.*;

public class find_missing_element {
	
	public static void main(String[] args) {
		int [] arr = {1,4,2,5};
		int min = arr[0];
		int max = arr[0];
		
		for(int num:arr) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		
		HashSet<Integer> set = new HashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		 List<Integer> missing = new ArrayList<>();
		 for (int i = min; i <= max; i++) {
			if(!set.contains(i)) {
				missing.add(i);
			}
		}
		System.out.println(missing);
	}

}
