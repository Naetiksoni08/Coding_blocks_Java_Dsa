package blind_45_days_sheet;

import java.util.*;

public class Combination_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		List<List<Integer>> ll = new ArrayList<>();
		combination(n, k, new ArrayList<>(), 1, ll);
		System.out.println(ll);

	}

	public static void combination(int n, int k, List<Integer> temp, int idx, List<List<Integer>> ll) {
		if (temp.size() == k) {
			ll.add(new ArrayList<>(temp));
			return;
		}

		for (int i = idx; i <= n; i++) {
			temp.add(i);
			combination(n, k, temp, i + 1, ll);
			temp.remove(temp.size() - 1);
		}
	}

}


//public static void main(String[] args) {
//    int n = 4;
//    int k = 2;
//    combination(n, k, "", 0, 1);
//}
//
//public static void combination(int n, int k, String ans, int kpsf, int idx) {
//    if (kpsf == k) {
//        System.out.println(ans);
//        return;
//    }
//
//    for (int i = idx; i <= n; i++) {
//        combination(n, k, ans + i + ",", kpsf + 1, i + 1);
//    }
//}
