package bitmasking;

public class bitmasking_demo {

	public static void main(String[] args) {
		//&-bit wise and
		// | bit wise or 
		int n = 67;
		if((n&1)==0) {
			System.out.println("even"); // number ke last digit ko check karenge agar voh 0 ke equal hua toh even number hai 
	 // if last digit is 1 then odd otherwise even o hua toh even
		}else {
			System.out.println("odd");
		}
		int n1 = 5;
		System.out.println(n1<<3);
		int n2 = -50;
		System.out.println(n2<<3);
 // jab bhi 2 ki power kuch bhi  nikal na ho toh left shift karenge forex 2 ki power 9 ko left shift karenge kese 
		// 1 x 2 ki power 9 = answer of two ki power 9 
		// bit masking operation 2 or 3 times faster than normal operation 
		// right shift
		int n3 = 5;
		System.out.println(n3>>3);
		int n4 = -50;
		System.out.println(n4>>3);
		// right shift mtlb ki n/2 ki power jitni baar shift karna h  for example 20/2 ki power 2 = 5
		int s = 20;
		System.out.println(s>>2);
		int s1 = -20;
		System.out.println(s1>>3); //  this is wrong this should be -2
		// right shift mai peeche se drop ho raha h aur aage 1 append ho raha isliye galat aah raha hai answer
	}

}
