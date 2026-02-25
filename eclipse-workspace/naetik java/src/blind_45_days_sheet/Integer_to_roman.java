package blind_45_days_sheet;

public class Integer_to_roman {

	public static void main(String[] args) {
		int num = 3749;
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder ans = new StringBuilder();
		while (num >= 1) {
			for (int i = 0; i < values.length; i++) {
				if (num >= values[i]) {
					ans.append(symbols[i]);
					num = num - values[i];
					break;
				}
			}

		}
		System.out.println(ans.toString());
	}

}
//4 aur 9 wale place values (4, 9, 40, 90, 400, 900) ke liye special cases zaroori hain kyunki Roman mein koi bhi symbol 3 se zyada baar repeat nahi ho sakta!
//IIII = 4  (4 baar repeat — invalid!) answer should be IV 
//this is a greedy approach because Greedy isliye kaha kyunki humne hamesha sabse bada value choose kiya jo num mein fit ho! jaise for num=3749 hum nai 1000 value sai compare kara sabsai phele 
//greedy means Greedy matlab — har step pe sabse best choice lo bina future ke soche!