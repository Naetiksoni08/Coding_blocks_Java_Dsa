package blind_45_days_sheet;

public class Compare_Version_Numbers {

	public static void main(String[] args) {
		String version1 = "1.2", version2 = "1.10";
		int i = 0;
		int j = 0;

		while (i < version1.length() || j < version2.length()) {
			int num1 = 0;
			int num2 = 0;

			while (i < version1.length() && version1.charAt(i) != '.') {
				num1 = num1 * 10 + (version1.charAt(i) - '0');
				i++; // yeh digits scan karta hai v1 ke jaise phele i mai 1 aaya fir dot aya fir 2 and so in
			}
			i++; // this skips dot jaise hi dot milla loop nai chalega aur i++ 
			
			while(j<version2.length() && version2.charAt(j)!='.') {
				num2 = num2*10+(version2.charAt(j)-'0');
				j++;
			}
			j++;
//			
//			if(num1>num2) return 1;
//			if(num1<num2) return -1;

		}
		System.out.println(0);
		

	}

}
