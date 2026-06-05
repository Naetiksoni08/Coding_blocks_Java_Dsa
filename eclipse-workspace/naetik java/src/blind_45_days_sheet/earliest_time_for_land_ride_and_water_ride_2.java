package blind_45_days_sheet;

public class earliest_time_for_land_ride_and_water_ride_2 {
	public static void main(String[] args) {
		int[] landStartTime = { 2, 8 }, landDuration = { 4, 1 }, waterStartTime = { 6 }, waterDuration = { 3 };
		int n = landStartTime.length;
		int m = waterStartTime.length;
		// precompute minimumlandfinish phele sai hi
		int minimumlandfinish = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			minimumlandfinish = Math.min(minimumlandfinish, landStartTime[i] + landDuration[i]);

		}
		// precompute minimumwaterfinish phele sai hi
		int minimumwaterfinish = Integer.MAX_VALUE;
		for (int j = 0; j < m; j++) {
			minimumwaterfinish = Math.min(minimumwaterfinish, waterStartTime[j] + waterDuration[j]);

		}

		int ans = Integer.MAX_VALUE;
		for (int j = 0; j < m; j++) {
			int finish = Math.max(minimumlandfinish, waterStartTime[j]) + waterDuration[j];
			ans = Math.min(ans, finish);
		}
		for (int i = 0; i < n; i++) {
			int finish = Math.max(minimumwaterfinish, landStartTime[i]) + landDuration[i];
			ans = Math.min(ans, finish);
		}
		System.out.println(ans);
	}

//	Precomputing ne N*M combinations ko N+M kar diya — kyunki ek side ka minimum hamesha best choice tha, baaki sab useless the! 🎯

}

//Precompute kiya:  minLandFinish  → O(n)
//minWaterFinish → O(m)
//
//Order 1 loop:     O(m)
//Order 2 loop:     O(n)
//
//Total: O(n+m) ✓ vs pehle O(n*m)
