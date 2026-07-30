package blind_45_days_sheet;

import java.util.*;

public class maximum_matching_of_players_with_trainers {
	class Solution {
		public int matchPlayersAndTrainers(int[] players, int[] trainers) {
			int i = 0;
			int j = 0;
			int count = 0;
			Arrays.sort(players);
			Arrays.sort(trainers);
			while (i < players.length && j < trainers.length) {
				if (players[i] <= trainers[j]) {
					i++;
					j++;
					count++;
				} else {
					j++;
				}
			}
			return count;
		}
	}
}
//Sabse chhote ability wale player ko pehle match karo, aur uske liye sabse chhota sufficient trainer do!"
