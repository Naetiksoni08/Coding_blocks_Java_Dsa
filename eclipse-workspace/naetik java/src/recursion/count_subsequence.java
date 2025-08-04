package recursion;

public class count_subsequence {

	public static void main(String[] args) {
		  String ques = "abc";
		    print(ques ,""); // blank 
		    System.out.println(count);
	 
		}
	static int count = 0 ;
		public static void print(String ques, String ans) {
			if(ques.length() == 0) { // jaise hi 0 hogi length wahi se return 
				System.out.println(ans);
				count++;
				return;
				
			}
			char ch = ques.charAt(0); // for a o th character
			print(ques.substring(1), ans);
			print(ques.substring(1), ans + ch);
		


	}

}


// interviewer will say that count with the help of recursion then do this below code other wise the above count code is also easy and right
//
//public static void main(String[] args) {
//    String ques = "abc";
////    print(ques ,""); // blank 
//    System.out.println(count(ques,""));
//
//}
//public static void print(String ques, String ans) {
//	if(ques.length() == 0) { // jaise hi 0 hogi length wahi se return 
//		System.out.println(ans);
//		return;
//		
//	}
//	char ch = ques.charAt(0); // for a o th character
//	print(ques.substring(1), ans);
//	print(ques.substring(1), ans + ch);
//}
//
//public static int  count(String ques, String ans) {
//	if(ques.length() == 0) { // jaise hi 0 hogi length wahi se return 
//		System.out.println(ans);
//		return 1;
//		
//	}
//	char ch = ques.charAt(0); // for a o th character
//	int a1 =count(ques.substring(1), ans);
//	int a2 =count(ques.substring(1), ans + ch);
//	return a1+a2;
//}
//
//
//}
