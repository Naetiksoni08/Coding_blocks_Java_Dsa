package strings;

public class string_demo3 {

	public static void main(String[] args) {
	 String s1 = "hello";
	 System.out.println(s1);
	 String s2 = "naetik";
	 System.out.println(s2);
	 //concat the string 
	 String s3 = s1 + " " + s2; // adding spaces between hello and Naetik
	 System.out.println(s3);
	 String s4 = new String(); // creates a new empty string 
	 String s5 = new String("naetik soni");
	 System.out.println(s5);
	 //note this if u re using this method String s1 = "hello"; and this method string s3 = s1 + " " + s2; which the concat one then
	 // the string will be created inside the pool but any other method except these two will create string outside the pool
	
	 
	 //mutable and immutable string 
	 // refer to the notebook 
	 
	 
	 
	 
	 
	 
	 
	 
	 System.out.println(" hello "+ 10+ 20+ "bye");
	 System.out.println(" hello " + (10 + 20) + "bye");
	 System.out.println(10 + 20+ "hello" + "bye" );
	 
	 
	 
	 
	  String s6 = "hello";
	  String s7 = new String("hello");
	  System.out.println(s6==s7); // this gives false because the address is different 
	  int a1 = 9; 
	  int a2 = 9;
	  System.out.println(a1==a2); // the address is same
	  System.out.println(s6.equals(s7)); // hello and hello so that is why it gives true
	  //note if u want to compare the content then write .equals to function and if u want to compare the address then use == only 
	
	  
	  
	  //if u want to go from string to integer then do this
	  String s8 = "4567889";
	  int x = Integer.parseInt(s8);
	  System.out.println(s8); // this is how u go from string to integer 
	  //if u want to go from string to long then do this
	  String s9 = "5673492894";
	  long l = Long.parseLong(s9);
	  System.out.println(s9);
	 

	}

}
