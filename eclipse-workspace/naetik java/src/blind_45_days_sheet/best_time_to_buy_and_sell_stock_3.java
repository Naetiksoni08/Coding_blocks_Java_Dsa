package blind_45_days_sheet;

public class best_time_to_buy_and_sell_stock_3 {
	public class BestTimeToBuySellStockIII {

		public static void main(String[] args) {
			int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };
			System.out.println(maxProfit(prices));
		}

		public static int maxProfit(int[] prices) {

			int buy1 = Integer.MIN_VALUE;
			int sell1 = 0;
			int buy2 = Integer.MIN_VALUE;
			int sell2 = 0;

			for (int price : prices) {

				// first buy
				buy1 = Math.max(buy1, -price);
				// “Agar hum buy karenge toh hume paise dene padenge toh price minus me ho jata
				// hai.
				// Aur buy1 isliye hai ki agar pehle kabhi khareeda ho, un dono ka max.”
				// first sell
				sell1 = Math.max(sell1, buy1 + price);
//	            buy1 + price = buy ke baad aaj sell = profit 
//	            sell1 = pehle ka best profit

				// second buy
				buy2 = Math.max(buy2, sell1 - price);
				// sell1 = pehle transaction ka profit
				// sell1 - price = us profit se aaj second stock khareeda

				// second sell
				sell2 = Math.max(sell2, buy2 + price);
				//same like first sell = final profit ie our answer 
			}

			return sell2;
		}
	}

}
