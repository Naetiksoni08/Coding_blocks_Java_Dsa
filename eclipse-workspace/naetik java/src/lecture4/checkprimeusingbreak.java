package lecture4;

public class checkprimeusingbreak {

	public static void main(String[] args) {
		int cnt = 0;
		int n = 6;
		for(int i = 2; i<n; i++) {
			if( n % i == 0) {
				cnt++;
				break; // if you want to stop the loop deliberately 
				// loop se bhar aah jate hai 
			  }	
			}
			if(cnt>=1) {
				System.out.print("not prime");
			}
			else {
				System.out.print("prime");
		}
	}
}

