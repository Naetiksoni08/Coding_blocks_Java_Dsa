package blind_45_days_sheet;

import java.util.*;

public class count_largest_groups {
	public static void main(String[] args) {
		int n = 13;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			int sum = digitsum(i);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		int max = Collections.max(map.values());
		int count = 0;
		for (int val : map.values()) {
			if (val == max) {
				count++;
			}
			System.out.println(count);

		}

	}

	public static int digitsum(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;

		}
		return sum;
	}

}

//
//i=1:  digitSum(1)  = 1        map={1:1}
//i=2:  digitSum(2)  = 2        map={1:1, 2:1}
//i=3:  digitSum(3)  = 3        map={1:1, 2:1, 3:1}
//i=4:  digitSum(4)  = 4        map={1:1, 2:1, 3:1, 4:1}
//i=5:  digitSum(5)  = 5        map={1:1, 2:1, 3:1, 4:1, 5:1}
//i=6:  digitSum(6)  = 6        map={..., 6:1}
//i=7:  digitSum(7)  = 7        map={..., 7:1}
//i=8:  digitSum(8)  = 8        map={..., 8:1}
//i=9:  digitSum(9)  = 9        map={..., 9:1}
//i=10: digitSum(10) = 1+0 = 1  map={1:2, ...}
//i=11: digitSum(11) = 1+1 = 2  map={1:2, 2:2, ...}
//i=12: digitSum(12) = 1+2 = 3  map={1:2, 2:2, 3:2, ...}
//i=13: digitSum(13) = 1+3 = 4  map={1:2, 2:2, 3:2, 4:2, ...}


//final map becomes {1:2, 2:2, 3:2, 4:2, 5:1, 6:1, 7:1, 8:1, 9:1}


//max count from whole map = max = 2


//max count wale groups 1→2 ✅ count=1
//2→2 ✅ count=2
//3→2 ✅ count=3
//4→2 ✅ count=4
//5→1 ❌
//6→1 ❌
//7→1 ❌
//8→1 ❌
//9→1 ❌