package lecture5;

import java.util.Scanner;

public class countofdigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int n = sc.nextInt(); 
		System.out.println(COD(n)); // call of the function
		
}
	public static int COD(int n ) {
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
		}
		
}


