package blind_45_days_sheet;

public class teemo_attacking {
	public static void main(String[] args) {
		int[] timeseries = { 1, 4 };
		int duration = 2;
		int total = 0;
		if (timeseries.length == 0)
			System.out.println(0);
		for (int i = 0; i < timeseries.length - 1; i++) {
			int gap = timeseries[i + 1] - timeseries[i];

//			total += Math.min(gap, duration);
			if (gap < duration) {
				total += gap; // gap chota tha, poison pura khatam nai hua
			} else {
				total += duration; // Gap bada tha, poison poora khatam hua
			}
		}
		// LAST ATTACK hamesha poora duration add karega
		total += duration; // The logic is simple: the last attack will always add the whole duration
							// because there will be no I+1 index currently at the last index of the time
							// series. There will be no I+1 index so the gap will not be calculated and the
							// whole duration will be taken and absorbed or added to that total time
		System.out.println(total);

	}

}
