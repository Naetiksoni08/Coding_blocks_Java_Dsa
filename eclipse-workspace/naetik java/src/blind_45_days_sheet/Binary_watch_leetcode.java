package blind_45_days_sheet;

import java.util.*;

public class Binary_watch_leetcode {

	public static void main(String[] args) {
		int turnon = 1;
		List<String> ll = new ArrayList<>();
		binarywatch(turnon, 0, 0, 0, 0, ll);
		System.out.println(ll);

	}

	public static void binarywatch(int turnon, int hour, int min, int idx, int count, List<String> ll) {
		if (count == turnon) {
			if (hour < 12 && min < 60) { // Hours can only go from 0–11 and min can only go from 0 to 59
				ll.add(hour + ":" + String.format("%02d", min)); // “Format this number as a 2-digit integer, padding
																	// with zeros if needed.” and % this a format
																	// specific d is for integer basically it says that
																	// u need to make 2 digits if the min comes with 2
																	// digit then dont add leading 0 otherwise add 0
			}
			return;
		}

		if (idx == 10) { // mentioned in the question tha 4 hours+6minutes led = 10led so if idx==10 then
							// we have gone through all the leds
			return;// There are total 10 LEDs (indexes 0 to 9)
		}
		if (idx < 4) { // 4 leds for hours
			binarywatch(turnon, hour + (1 << idx), min, idx + 1, count + 1, ll); // idx value will get changed in the next frame not here 

		} else { // else 6 for min
			binarywatch(turnon, hour, min + (1 << (idx - 4)), idx + 1, count + 1, ll); 

		}
		binarywatch(turnon, hour, min, idx + 1, count, ll); // This is the “skip LED” option.
		// At each position://You can turn ON the LED → increase count //Or skip it →
		// keep count the same, move to the next LED Without this, you’d only explore
		// the “turned ON” path and basically after hitting the base case count==turnon then the flow comes here and then it sets count=0 again and make idx+1

	}

}
