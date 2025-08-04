package recursion_backtracking_bitmasking_practice;


import java.util.*;


		public class lexicography_leetcode {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int n = 13;
				
				List<Integer> ll  = new ArrayList<>();
				for(int i = 1 ; i <= 9 ; i++) {
						
				counting(n, i,ll);
				}
				System.out.print(ll);
				

			}

			public static void counting(int n, int curr,List<Integer> ll) {
				if (curr > n) {
					return;
				}
				ll.add(curr);
				
				for (int i = 0; i <= 9; i++) {
					counting(n, curr * 10 + i,ll);

				}
		


	}

}
