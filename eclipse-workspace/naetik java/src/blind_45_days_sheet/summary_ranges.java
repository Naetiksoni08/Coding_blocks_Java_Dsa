package blind_45_days_sheet;

import java.util.*;

public class summary_ranges {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 3, 4, 6, 8, 9};
		List<String> result = new ArrayList<>();
		if (arr.length == 0)
			System.out.println(result);
		int rangestart = arr[0]; // 0
		for (int i = 1; i < arr.length; i++) { // 1 sai 6
			if (arr[i] != arr[i - 1] + 1) {
				// 2 != 0+1 so 2!=1 yes gap hai  
				if (rangestart == arr[i-1]) { // 0 == 0 yes 
					result.add(String.valueOf(rangestart)); // 0 
				} else {
					result.add(rangestart + "->" + arr[i - 1]);
				}
				rangestart = arr[i]; // came on 1 
			}
		}
		if (rangestart == arr[arr.length - 1]) {
			result.add(String.valueOf(rangestart));
		} else {
			result.add(rangestart + "->" + arr[arr.length - 1]);
		}
		System.out.println(result);

	}

} // note iss question mai hum abhi piche wala element ko current element sai
	// compare kar rahe hai hum ulta bhi kar sakte hai ki hum apne aage wale ko
	// compare kare start kare 0 sai loop aur if (arr[i+1]!=arr[i]+1) this will also
	// work keeptinge everything else same just few fixes 
