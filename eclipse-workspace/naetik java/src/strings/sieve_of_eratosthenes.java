package strings;

public class sieve_of_eratosthenes {

	public static void main(String[] args) {
		int n = 120;
		int result = prime_seive(n);
		System.out.println(result);
	}
	public static int prime_seive(int n) {
		int [] prime = new int [n+1]; // 120 tak ka chhaiye 121 tak ayega 
		prime[0] = prime[1] = 1; // not prime 1 gaya 1 par aur 1 gaya 0 par toh answer no prime that is 0
		for(int i = 2; i*i <prime.length; i++) { // 2 3 5 7 ke liye chalega 
			if(prime[i] == 0) {
				for(int j = 2 ; j*i<prime.length; j++) { // it reads the table 
					prime[i*j] = 1;
				}
				
			}
		}
		int c = 0 ;
		for(int i=2; i<prime.length; i++) {
			if(prime[i]==0) {
				c++;
			}
		}
		return c; //counting the prime number 
		
		
	}
 
}
