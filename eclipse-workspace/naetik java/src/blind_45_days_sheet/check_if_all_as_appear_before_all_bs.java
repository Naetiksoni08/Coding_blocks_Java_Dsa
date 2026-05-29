package blind_45_days_sheet;

public class check_if_all_as_appear_before_all_bs {

	public static void main(String[] args) {
		String s = "aaabbb";
		boolean bseen = false;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			// phele check b kyuki humari approach hai ki agar koi b ke baad a aya toh false
			if (ch == 'b') {
				bseen = true;
			}
			if (ch == 'a' && bseen) { // agar character a hai koi prob nai hai lekin agar b seen true hai toh iska
										// mtlb ki b phele dekhlia hai humnai so seedha false kardo kyuki b phele dekh
										// chuke hai a sai
				System.out.println(false);
			}
		}
		System.out.println(true);
	}

}
