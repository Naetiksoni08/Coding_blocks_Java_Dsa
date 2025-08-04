package recursion3;

public class sieve_of_eratosthenes {

	public static void main(String[] args) {
		int n = 100;
		primesieve(n);

	}

	// jis index par false hoga voh prime index hoga
	// jis par true hoga voh not prime index hoga
	public static void primesieve(int n) {
		boolean[] prime = new boolean[n + 1]; // 101 ko access karna h
		prime[0] = true; // 0 and one nai hoga prime number
		prime[1] = true;
		for (int i = 2; i * i < n; i++) {
			if (prime[i] == false) {
				for (int j = 2; i * j <= prime.length; j++) {
					prime[i * j] = true;
				}

			}

		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.print(i + " ");
			}
		}
	} // time complexity is n*log of log n 

}
