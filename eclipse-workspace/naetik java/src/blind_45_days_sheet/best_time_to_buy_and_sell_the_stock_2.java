package blind_45_days_sheet;

public class best_time_to_buy_and_sell_the_stock_2 {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(besttime(prices));
	}

	public static int besttime(int[] arr) {
		int profit = 0;
		for (int i = 1; i < arr.length; i++) {
			// agar aaj ka price kal se zyada hai
			if (arr[i] > arr[i - 1]) {
				profit += arr[i] - arr[i - 1]; // aaj ka price-kal ka price voh profit hoga that means ki kal buy aaj
												// sell
			}
		}
		return profit;

	}
}
