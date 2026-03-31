package blind_45_days_sheet;

import java.util.*;

public class design_event_manager {

	class EventManager {
		PriorityQueue<int[]> pq;
		HashMap<Integer, Integer> map = new HashMap<>();

		public EventManager(int[][] events) {
			pq = new PriorityQueue<>((a, b) -> {
				if (a[0] == b[0])
					return a[1] - b[1];
				return b[0] - a[0];
			});
			for (int[] e : events) {
				int eventid = e[0];
				int priority = e[1];
				map.put(eventid, priority);
				pq.add(new int[] { priority, eventid });
			}

		}

		public void updatePriority(int eventId, int newPriority) {
			map.put(eventId, newPriority);
			pq.add(new int[] { newPriority, eventId });
		}

		public int pollHighest() {
			while (!pq.isEmpty()) {
				int[] top = pq.poll();
				int Priority = top[0];
				int eventId = top[1];
				if(!map.containsKey(eventId)) {
					continue;
				}
				if(map.get(eventId)!=Priority) {
					continue;
				}
				map.remove(eventId);
				return eventId;

			}
			return -1;

		}
	}

}
