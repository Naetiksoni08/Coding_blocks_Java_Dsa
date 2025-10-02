package blind_45_days_sheet;

public class gas_station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		System.out.println(gasstation(gas, cost));

	}

	public static int gasstation(int[] gas, int[] cost) {
		int total = 0;
		int tank = 0;
		int position = 0;
		for (int i = 0; i < gas.length; i++) {
			int diff = gas[i] - cost[i];
			total += diff;
			tank += diff;

			if (tank < 0) {
				position = i + 1;
				tank = 0;
			}
		}
		return (total >= 0) ? position : -1;
	}

}

//Agar total < 0 → iska matlab petrol ka amount hi kam hai cost se.
//Chahe kisi bhi station se start kare, circle complete karna possible hi nahi.
//Agar total >= 0 → matlab theoretically ek solution zaroor exist karega.


////tank ek temporary local tank hai jo track karta hai:
//"Agar mai iss current position se chalu karu toh kya main yahan tak survive kar pa raha hoon?"


//Agar kabhi tank < 0 ho jaaye:
//Matlab iss start se lekar yaha tak aate aate petrol khatam ho gaya.
//Toh is start se leke iss station tak fail hai. so i+1 sai karo check
