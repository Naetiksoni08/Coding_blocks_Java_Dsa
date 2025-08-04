package strings;

public class is_prime_number {

	public static void main(String[] args) {
		int n = 100;
		int c = 0 ; 
		for(int i = 2; i < n; i++) {
			c++;
			
		}
		System.out.println(c);

	}
	public static boolean isprime(int n ) {
//		for(int i = 2; i<n; i++) {
//			if(n%i!=0) {
//				return false;
//			}
//		}
//		return true;
//	}
		int div = 2;
		while(div*div<=n) {
			if(n%div == 0) {
				return false;
			}
			div++;

	}
		return true;
     }
	
}
//but this will also give tle so in order to solve this we will use a algo called sieve of eratosthenes
