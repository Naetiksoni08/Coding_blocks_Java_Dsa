package strings;

public class substring_length_wise {

	public static void main(String[] args) {
		String s = "codingblocks";
		printallsubstring(s);
		
	}
	public static void printallsubstring(String s) {
		for(int len = 0 ; len<s.length(); len++) {
		for(int j = len; j<=s.length(); j++) {
				int i = j-len; //  this is done because if we want to print from 2 to 7 then we write till 8 also this is used t0 calculate the strtting index hwo
			// length =5 j =7 so 7-5 = 2 which mean s.substring(2,7);
				System.out.println(s.substring(i, j));			
				}
		}
	}

}


