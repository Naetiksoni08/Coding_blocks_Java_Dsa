package blind_45_days_sheet;

public class best_time_to_buy_and_sell_the_stock {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(besttime(prices));
	}

	public static int besttime(int[] arr) {
		int minprice = arr[0];
		int maxprofit = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minprice) { // agar minprice sai bhi koi chota price milta hai toh update minprice
				minprice = arr[i];
			} else {
				maxprofit = Math.max(maxprofit, arr[i] - minprice); // maxprofit ko update karenge by comparing abhi ka
																	// current maxprofit,aaj ka stock ka price-minprice
																	// so far
			}
		}
		return maxprofit;
	}

}
