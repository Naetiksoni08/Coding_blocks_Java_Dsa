package blind_45_days_sheet;

public class maximum_ice_cream_bars {

	public static void main(String[] args) {
		int[] costs = { 1, 3, 2, 4, 1 };
		int coins = 7;
		int maxcount = 0;
		for (int c : costs) {
			maxcount = Math.max(maxcount, c);
		}
		int[] count = new int[maxcount + 1];
		for (int c : costs) {
			count[c]++;
		}
		int bars = 0;
		for (int price = 1; price <= maxcount; price++) {
			if (count[price] == 0)
				continue;

			int canbuy = Math.min(count[price], coins / price);
			bars += canbuy;
			coins -= canbuy * price;
			
			if(coins == 0) break;

		}
		System.out.println(bars);

	}

}
