package lecture4;

import java.util.Scanner;

public class inverse_a_number {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);		
    int n = sc.nextInt(); 
	int sum = 0;
	int place = 1;
	while(n > 0) {
		int rem =n % 10;
		//sum = sum + (int) (place * Math.pow(10 , rem-1));
		sum+=place * Math.pow (10 , rem-1); // this is also write this do internal type casting 
		//power is a type of double that is why int that is type casting
		// why we put integer because if we do not put integer then this value will give a double value that is it will give in . so we put integer 
		// also if we want to put a ki power something then we have to write this function as math.power m should be in capital
		n = n/10;
		place++;
		
		
	}
	System.out.print(sum);

	}

}
