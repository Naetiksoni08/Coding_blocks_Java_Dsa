package blind_45_days_sheet;

public class check_ascii_palindrome {
	public static void main(String[] args) {
		String s = "ff";
		StringBuilder ans = new StringBuilder();
		for (char c : s.toCharArray()) {
			int number = (int) c;
			String binarydigit = String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');
			ans.append(binarydigit);
		}
		String finalstr = ans.toString();
		int left = 0;
		int right = finalstr.length() - 1;
		while (left < right) {
			if (finalstr.charAt(left) != finalstr.charAt(right)) {
				System.out.println(false);
				break;
			}
			left++;
			right--;
		}
		System.out.println(true);
	}

}

// the thing is that tobinarystring which gives the binary digit of any number say 102 hai so 102 ko binary mai jaise bhi likhenge voh return kar ke dedega binary string
// but the problem is that built in method tobinarystring joh hai voh leading zeroes preserve nai karta mtlb Ye method sirf minimum bits mein binary deta hai, leading zeros nahi rakhta.
// but question mai clearly bola hai ki bhai leading zeros ko include karo toh aab kya kare also agar leading zeros avoid kare toh kya hoga joh actual length hai of the number voh galat ayegi so ab kya kare
// hum manually add kardenge leading zeros kese 
// String binary = String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0');
// "%8s" this means ki 8 bit wide string banao agar kam hai toh spaces sai fill karega yeh phir bas joh voh spaces hai na unki jagah 0 rakhdo thats it 

//example
//Integer.toBinaryString(102) = "1100110"   (7 chars)
//String.format("%8s", "1100110") = " 1100110"  (8 chars, ek space padding se)
//.replace(' ','0') = "01100110"   sahi 8-bit representation
// also %s format specifier ka default behavior: Right-aligned mtlb Java mein String.format("%8s", ...) ka default alignment hota hai right-aligned — matlab agar string chhoti hai target width se, toh spaces LEFT side (shuru) mein add honge, right side (end) mein nahi.
// to proove this dekh System.out.println("[" + String.format("%8s", "abc") + "]"); iska output bhi [     abc] 5 spaces from starting 
