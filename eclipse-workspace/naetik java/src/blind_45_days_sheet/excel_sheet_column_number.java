package blind_45_days_sheet;

public class excel_sheet_column_number {

	public static void main(String[] args) {
		String coltitle = "A";
		int result = 0;
		for (char ch : coltitle.toCharArray()) {
			result = result * 26 + (ch - 'A' + 1); // +1 because a=0 but in this question a = 1 so a-a+1 = 0-0+1 = 1(A)
			
		}
		System.out.println(result);
	}

}
