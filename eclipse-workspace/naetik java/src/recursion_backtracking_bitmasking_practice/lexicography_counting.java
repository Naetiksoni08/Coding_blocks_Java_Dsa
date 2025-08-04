package recursion_backtracking_bitmasking_practice;

import java.util.*;

public class lexicography_counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		List<Integer> ll  = new ArrayList<>();
		counting(n, 0,ll);
		System.out.print(ll);
		

	}

	public static void counting(int n, int curr,List<Integer> ll) {
		if (curr > n) {
			return;
		}
		ll.add(curr);
		int i = 1;
    	if (curr == 0) {
			i = 1; // we want ki agar current 0 hai ya current exist krta hai tabh toh loop 9 time
					// work kare but if it does not exist then loop 10 times work kare
    	}
		for (; i <= 9; i++) {
			counting(n, curr * 10 + i,ll);

		}
	}

}
