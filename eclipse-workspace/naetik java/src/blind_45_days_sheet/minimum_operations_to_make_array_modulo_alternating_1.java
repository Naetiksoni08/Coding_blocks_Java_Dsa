package blind_45_days_sheet;

public class minimum_operations_to_make_array_modulo_alternating_1 {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 8 };
		int k = 3;

		int mincost = Integer.MAX_VALUE;
		for (int x = 0; x < k; x++) {
			for (int y = 0; y < k; y++) {
				if (x != y) {
					int cost = 0;
					for (int i = 0; i < arr.length; i++) {
						if (i % 2 == 0) { // even par x
							int curr = arr[i] % k;
							int diff = Math.abs(curr - x);
							cost += Math.min(diff, k - diff);
						} else { // odd index par y
							int curr = arr[i] % k;
							int diff = Math.abs(curr - y);
							cost += Math.min(diff, k - diff); // ya toh 4%3 = 1 curr = 1 and y = 1 hota hai theke ab toh
																// 0 operations yeh nikal diff = curr-y = 1-1 = 0 yani
																// no operstion needed na hi +1 na hi -1 needed in curr
																// element that is 4 cuz 4%3 gives 1 apne aap hi second
																// way is ki mujhe y=1 chahiye right so 4 ko kaise tweek
																// karu ki %3 karne sai == y ho jaye so 4 ko mai +3
																// kardunag 7%3 = 1 cool so 3 operations needed 4+3 = 7
																// theke 7 wala aya k-diff sai k was 3-0 = 3 so min of
																// 3,0 = 0
						}
					}
					mincost = Math.min(mincost, cost); //(2,+infinity) = min 2 ayega bas 
				}
			}

		}
		System.out.println(mincost);

	}
	
//	x = 0 y=1
//	i=0 (even): curr=1%3=1, diff=|1-0|=1, cost+=min(1,2)=1 → cost=1
//			i=1 (odd):  curr=4%3=1, diff=|1-1|=0, cost+=min(0,3)=0 → cost=1
//			i=2 (even): curr=2%3=2, diff=|2-0|=2, cost+=min(2,1)=1 → cost=2
//			i=3 (odd):  curr=8%3=2, diff=|2-1|=1, cost+=min(1,2)=1 → cost=3
//			mincost = min(MAX, 3) = 3

}
