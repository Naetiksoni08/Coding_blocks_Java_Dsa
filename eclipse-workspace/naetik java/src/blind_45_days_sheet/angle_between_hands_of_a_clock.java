package blind_45_days_sheet;

public class angle_between_hands_of_a_clock {

	class Solution {
		public double angleClock(int hour, int minutes) {
			// Minute hand angle
			double minuteAngle = minutes * 6;
			// Hour hand angle
			double HourAngle = (hour % 12) * 30 + (minutes * 0.5); // hour%12 is for safety cuz if hr = 15 then 15%12 =3
			// Difference between both
			double angle = Math.abs(HourAngle - minuteAngle);
			return Math.min(angle, 360 - angle); // smaller one

		}
	}
}
