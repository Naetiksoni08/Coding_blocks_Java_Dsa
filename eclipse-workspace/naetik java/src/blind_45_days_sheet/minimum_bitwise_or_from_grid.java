package blind_45_days_sheet;
import java.util.*;

public class minimum_bitwise_or_from_grid {
	public static void main(String[] args) {
		int[][] arr = { { 1, 5 }, { 2, 4 } };
//		int result = 0;
//		for (int i = 0; i < arr.length; i++) {
//			 int minOR = Integer.MAX_VALUE;
//			 for(int j = 0; j < arr[i].length; j++) {
//				 minOR = Math.min(minOR,result|arr[i][j]);
//			 }
//			 result = minOR;
//		}
//		System.out.println(result); // this gives answer correctly locally but wrong approach
		
		
		Set<Integer> possible = new HashSet<>();
		possible.add(0);
		for (int i = 0; i < arr.length; i++) {
			Set<Integer> next = new HashSet<>();
			for(int prev:possible) {
				for (int j = 0; j < arr[i].length; j++) {
					next.add(prev|arr[i][j]);
				}
				
			}
			possible=next;
		}
		System.out.println(Collections.min(possible));
// this gives tle
		
	}

}
