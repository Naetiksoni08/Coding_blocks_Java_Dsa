package strings;

public class substring {

	public static void main(String[] args) {
	  String s = "codingblocks";
	  System.out.println(s.substring(2, 7)); // substring mai last char nai aata if we want till 8 then we will write till 9  +1 karke 
      printallsubstring(s);
	  System.out.println(s.substring(2)); // 2 se end tak chalega 
	}
	public static void printallsubstring(String s) {
		for(int i = 0 ; i <s.length(); i++) {
			for(int j = i+1; j<s.length(); j++) {
				String str = s.substring(i, j);//method
				System.out.println(str);
			}
		}
	}

}

	