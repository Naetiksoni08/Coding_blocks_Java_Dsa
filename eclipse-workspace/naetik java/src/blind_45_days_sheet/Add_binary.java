package blind_45_days_sheet;

public class Add_binary {

	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		StringBuilder result = new StringBuilder();
		int carry = 0;
		int i = a.length() - 1;
		int j = b.length() - 1;
		while (i >= 0 || j >= 0 || carry != 0) {
			int sum = carry;
			if (i >= 0) {
				sum += a.charAt(i) - '0';
				i--;
			}
			if(j>=0) {
				sum+=b.charAt(j)-'0';
				j--;
			}
			result.append(sum%2);
			carry  = sum/2;
			
			

		}
		System.out.println(result.reverse().toString());

	}
}
