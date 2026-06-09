package blind_45_days_sheet;

import java.util.*;

public class minimum_common_value {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3};
		int [] arr2 = {2,3};
		HashSet<Integer> set  = new HashSet<>();
		for(int num:arr1) {
			set.add(num);
		}
		for(int num:arr2) {
			if(set.contains(num)) {
				System.out.println(num);
			}
		}
		System.out.println(-1);
		
	}

}
