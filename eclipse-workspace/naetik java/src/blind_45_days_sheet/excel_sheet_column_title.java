package blind_45_days_sheet;

public class excel_sheet_column_title {

	public static void main(String[] args) {
		int colno = 28;
		StringBuilder sb = new StringBuilder();
		while (colno > 0) {
			colno--; // converted 1 index to 0 indexed
			sb.append((char) ('A' + colno % 26));
			colno /= 26;

		}
		System.out.println(sb.reverse().toString());
	}

}

//Step 1:
//28-1=27, 27%26=1 → 'A'+1=66 → (char)66='B'
//sb="B", 27/26=1
//
//Step 2:
//1-1=0, 0%26=0 → 'A'+0=65 → (char)65='A'
//sb="BA", 0/26=0 → loop khatam!
//
//reverse("BA") = "AB" 
//End se build kar rahe hain — last character pehle aata hai!