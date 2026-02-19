package blind_45_days_sheet;

public class Stone_game_9 {
	public static boolean main(String[] args) {
		int[] arr = { 2, 1 };
		int count0 = 0, count1 = 0, count2 = 0;
		for(int stone:arr) {
			int reminder = stone%3;
			if(reminder==0) count0++;
			  else if (reminder == 1) count1++;
			  else count2++;
			
		}
		  if (count1 == 0 && count2 == 0) return false;
		  
		  if (count0 % 2 == 0) {
			    // Even count0: Alice wins if both exist
			    return count1 > 0 && count2 > 0;
			} else {
			    // Odd count0: Alice wins if big difference
			    return Math.abs(count1 - count2) > 2;
			}

	}

}
