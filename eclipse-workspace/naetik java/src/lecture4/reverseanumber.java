package lecture4;

import java.util.Scanner;

public class reverseanumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int n = sc.nextInt(); 
		int rev= 0;
		while(n>0) {
			int rem = n % 10;
		    rev = rev * 10 + rem;
			n/=10;//n=n/10
		}
		System.out.println(rev);
// i +=1 (int) (i+1)
		

	}

}

