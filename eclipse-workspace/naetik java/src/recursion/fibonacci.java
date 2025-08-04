package recursion;

public class fibonacci {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fibo(n));
	}
	public static int fibo(int n) { 
		if(n==0 || n==1) { // base case two choice we have that is n-1 and n-2 and 2 base case we wrote 
			return n;
		}
		int f1 = fibo(n-1); // hey recursion give me the value of n-1 and n-2
		int f2 = fibo(n-2);
		return f1+f2; // when we have more than 1 recursive call then we do not make call stack we make recursion tree 
		// 2 ki power n is the time complexity 
		// har jagah se 2 call ja rahi h 
		// 2 ki power 0 in the first tree then 2 ki power 1 2 ki power 2 and so on so 2 ki n 
		// tc is 2n
		// ek jagah se jitni call utna 4 ki power n 6 ki 2 ki 3 ki power n 
	}

}
