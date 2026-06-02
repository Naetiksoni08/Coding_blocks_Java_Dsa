package blind_45_days_sheet;

import java.util.Arrays;

public class minimum_cost_of_buying_candies_with_discount {

	public static void main(String[] args) {
		int[] cost = { 1, 2, 3 };
		int j = 0;
		int total = 0;
		Arrays.sort(cost);
		for (int i = cost.length - 1; i >= 0; i--) {
			j++;
			if (j % 3 == 0)
				continue; // 3rd candy ko free lo
			total += cost[i];

		}
		System.out.println(total);

	}
}

// ek aur array ka exmaple lete hai fir samjh aah jayega easily
// cost = [2,2,5,6,7,9] ascending sort karo 2,2,5,6,7,9 ab 9 sai loop chala rahe
// hai theke ulta
// objective yeh hai ki hume sari candy buy karni hai but at minimum cost
// [2,2,5,6,7,9] yeh sab cost hai theke so 9 sai start karte hai ulta loop
// dekh agar mai 9 kharred ta hu 7 khareed ta hu toh mujhe 6 free mil jayegi
// only if minimum of 9,7 = 7 >=6 which is yes so 6 free so
// 5th index = 9 4th is 7 so 3%3==0 continue 6 free mil gai so catch yeh hai ki
// agar descending order mai sort karenge na (loop ulta mtlb descending hi
// hogaya) toh 100 percent third candy joh hogi voh choti hogi first 2 ke
// minimum sai so 3rd candy humesha free mil jayegi
// also hum yehi chahenge ki joh mehengi candy hai vohi hume free mile kyuki
// sasi candy agar hum free mai lete hai toh fir theek hai but compartively
// minimum cost nai ayegi jaise yeh example dekh le

// cost = [9, 7, 6, 5, 2, 2]
//Option 1 - Sasti free lo:
//Buy 9,7 → free 2
//Buy 6,5 → free 2
//Pay = 9+7+6+5 = 27
//
//Option 2 - Mehengi free lo:
//Buy 9,7 → free 6  ← mehengi free!
//Buy 5,2 → free 2  ← mehengi free!
//Pay = 9+7+5+2 = 23 ✓ MINIMUM!

//time complextiy becomes n logn for sorting and n for loop so nlogn + n  = nlogn prominent wala n drop hoagaya
//Greedy Choice: Har step pe sabse mehengi 2 candies kharido → 3rd mehengi wali free lo mehengi candy lo kyuki overall minimum cost milega 
//
//Greedy Ki Pehchaan
//
//"Har step pe locally best choice lo → globally best answer milega"
//
//Yahan:
//
//Local choice = mehengi candy free lo
//Global result = minimum total cost ✓


//Sort ke 2 reasons:
//Mehengi candies kharido → free mein sabse mehengi milegi → max savings
//Descending mein 3rd hamesha choti hogi → free condition automatically satisfy!
