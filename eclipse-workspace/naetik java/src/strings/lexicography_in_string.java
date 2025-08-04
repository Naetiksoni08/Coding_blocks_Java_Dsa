package strings;

public class lexicography_in_string {

	public static void main(String[] args) {
		String s1 = "kunal";
		String s2 = "komal";
		System.out.println(s1.compareTo(s2)); // positive = s1>s2 negative s2>s1 zero s1==s2 // in this case s1>s2 
		//and 6 is coming because its is ascii value difference between u and o

	}
	public static int compareTo(String s1, String s2) { // write your own comparison to function 
		if(s1.equals(s2)) { // we have to compare the content so we can use .equal to function we have to compare the address of the s1 and s2 then we would have used == only
			return 0;
		}
		int len = Math.min(s1.length(), s2.length());
		for(int i = 0 ; i <len; i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i); // u-o = 6 which is the difference of ascii value  // return true
				// lets suppose i = k  for both of them so k!=k false so continues next u!=0 true so return the difference of the asscii value of both of them 
				//117-111=6 which is the answer
			}
		}
		return s1.length() - s2.length();	// here we have kunal and komal but if we have abcd and abcdef then first 4 element or char are same but we have t know which string was bigger so for that we wrote this line of code
		
	}

}
