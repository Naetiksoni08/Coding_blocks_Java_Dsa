package recursion;

public class factorial {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));
		

	}
	public static int factorial(int n) {
		//base case ( pmi 1st step)
		if(n==1 || n==0) {
			return 1; // jaise hi 1 mila ya 0 milla stop 
		}

		int fn = factorial(n-1); // we called our own function and said that n-1 factorial give me which is 4 fact
		//function calling itself
		return fn * n; // and if it is right then multiply it with 5 
		// helps to solve the smaller value 5-1 = 4 goes into fn and then multiply with n
		// big o n time complexity 
	}

}
