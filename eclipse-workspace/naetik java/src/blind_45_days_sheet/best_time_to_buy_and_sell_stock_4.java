package blind_45_days_sheet;

public class best_time_to_buy_and_sell_stock_4 {
	public static void main(String[] args) {
		int[] price = { 2, 4, 1 };
		int k = 2;
		System.out.println(bestitme(price, k));

	}

	public static int bestitme(int[] arr, int k) {
		int n = arr.length;
		if (n == 0 || k == 0) {
			return 0;
		}
		if (k >= n / 2) { // unlimited transations
			int profit = 0;
			for (int i = 1; i < arr.length; i++) {
				// agar aaj ka price kal se zyada hai
				if (arr[i] > arr[i - 1]) {
					profit += arr[i] - arr[i - 1];
				}
			}
			return profit;

		}
		int[] buy = new int[k + 1];
		int[] sell = new int[k + 1];

		for (int j = 1; j <= k; j++) {
			buy[j] = Integer.MIN_VALUE;
			sell[j] = 0; // same what we did in buy and sell 3 basically we also intailized like this
							// only in 3rd also
		}
		for (int price : arr) {
			for (int i = 1; i <= k; i++) {
				buy[i] = Math.max(buy[i], sell[i - 1] - price);
//				“Agar maine (i-1) transactions complete kar liye hain,
//				aur aaj i-th buy karta hoon,
//				toh meri net situation kya hogi?” basically reinvesting profit to buy anoher stock
				sell[i] = Math.max(sell[i], buy[i] + price);
				// “Agar maine (i-1) transactions complete kar liye hain,aur aaj i-th buy karta
				// hoon,toh meri net situation kya hogi?”
			}
		}
		return sell[k];

	}

	// these buy and sell array represents this buy[1] = buy1
//	sell[1]=sell1,buy[2]=buy2,sell[2]=sell2,buy[k],sell[k]

	// joh intialize kia hai vohe exactly yeh hai buy1 = -∞,sell1 = 0,buy2 =
	// -∞,sell2 = 0
}
