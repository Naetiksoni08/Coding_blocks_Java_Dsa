package blind_45_days_sheet;

public class earliest_time_for_land_ride_and_water_ride_1 {

	public static void main(String[] args) {
		int[] landStartTime = { 2, 8 }, landDuration = { 4, 1 }, waterStartTime = { 6 }, waterDuration = { 3 };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < landStartTime.length; i++) {
			for (int j = 0; j < waterStartTime.length; j++) {
				// first land to water
				int landtotaltime = landStartTime[i] + landDuration[i];
				int waterbegintime = Math.max(landtotaltime, waterStartTime[j]);
				int finish1 = waterbegintime + waterDuration[j];

				// now water to land
				int watertotaltime = waterStartTime[j] + waterDuration[j];
				int landbegintime = Math.max(watertotaltime, landStartTime[i]);
				int finish2 = landbegintime + landDuration[i];

				min = Math.min(min, Math.min(finish1, finish2));

			}
		}
		System.out.println(min);
	}

}
