package strings;

public class string_demo_2 {

	public static void main(String[] args) {
	  System.out.println("hello"+ 10 + 20 + "bye"); // string+anything is always will be string
	  System.out.println("hello"+ (10 + 20) + "bye");
	  System.out.println( 10 + 20 + "hello"+ "bye");
	  String s1 = "hello";
	  String s2 = new String("hello");
	  System.out.println(s1==s2); // this gives false because the address is different 
	  int a1 = 9; 
	  int a2 = 9;
	  System.out.println(a1==a2); // the address is same
	  System.out.println(s1.equals(s2)); // if we want to compare the address then == and if we want to compare the content then equals method
	  int len = s1.length(); // length of string // it is a function and in array it is a method 

	}
	public static boolean equals(String s1 , String s2) {
		if(s1==s2) {
			return true; 
		}
		if(s1.length() != s2.length()) {
			return false;
		}
		for(int i = 0 ; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) { // s1 = hello s2 = hello compare h with h e with e l with l and so on 
				return false ;
			}
			
		}
		return true;
	}

}
