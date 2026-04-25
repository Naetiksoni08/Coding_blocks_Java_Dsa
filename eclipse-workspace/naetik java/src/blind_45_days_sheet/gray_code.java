package blind_45_days_sheet;

import java.util.*;

public class gray_code {

	public static void main(String[] args) {
		int n = 2;
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < (1 << n); i++) {
			result.add(i ^ (i >> 1));
		}
		System.out.println(result);
	}
	// gray(i) = i XOR (i >> 1)
//i=0: 0 XOR 0 = 0  = 00
//i=1: 1 XOR 0 = 1  = 01
//i=2: 2 XOR 1 = 3  = 11
//i=3: 3 XOR 1 = 2  = 10
//[0,1,3,2] 
}
