package recursion;

public class sub_sequence {

	public static void main(String[] args) {
	    String ques = "abc";
	    print(ques ,""); // blank 
	   
 
	}
	public static void print(String ques, String ans) {
		if(ques.length() == 0) { // jaise hi 0 hogi length wahi se return 
			System.out.println(ans);
			return;
			
		}
		char ch = ques.charAt(0); // for a o th character
		print(ques.substring(1), ans);
		print(ques.substring(1), ans + ch);
	}
	
	

}
