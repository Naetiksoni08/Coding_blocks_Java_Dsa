package blind_45_days_sheet;

public class Detect_capital {

	public static void main(String[] args) {
		String word = "USA";
		if (word.equals(word.toUpperCase()))
			System.out.println(true);
		if (word.equals(word.toLowerCase()))
			System.out.println(true);
		if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()))
			System.out.println(true);

		System.out.println(false);
	}

}

//word.charAt(0) = 'G'
// Character.isUpperCase(Character.isUpperCase('G') = true
//Pehla character uppercase hai ya nahi!

//word = "Google"
//word.substring(1) = "oogle"  ← index 1 se end tak!
//Pehle character ke baad wali string!

//word.substring(1) = "oogle"
//word.substring(1).toLowerCase() = "oogle"
//"oogle".equals("oogle") = true