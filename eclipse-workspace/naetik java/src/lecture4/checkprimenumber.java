package lecture4;

import java.util.Scanner;

public class checkprimenumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 2; i<n; i++) {
			if( n % i == 0) {
				cnt++;
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


