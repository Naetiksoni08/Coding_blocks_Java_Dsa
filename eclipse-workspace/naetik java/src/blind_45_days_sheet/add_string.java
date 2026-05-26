package blind_45_days_sheet;

public class add_string {

	public static void main(String[] args) {
		String num1 = "456";
		String num2 = "77";
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		
		while (i >= 0 || j >= 0 || carry > 0) {
			int digit1 = 0; 
			int digit2 = 0;
			
			if (i >= 0) {
				digit1 = num1.charAt(i) - '0'; // ASCII value ('6' - '0' = 6)
				i--; 
			}
			if (j >= 0) {
				digit2 = num2.charAt(j) - '0'; // ASCII value ('7' - '0' = 7)
				j--; 
			}
			
			int sum = digit1 + digit2 + carry; // sum  = 6+7+0 = 13
			
			carry = sum / 10; // 13/10 = 1.3 = 1 as carry // quotient
			sb.append(sum % 10); // 13%10 = 3  // reminder
		}
		
		System.out.println(sb.reverse().toString());
	}
}
