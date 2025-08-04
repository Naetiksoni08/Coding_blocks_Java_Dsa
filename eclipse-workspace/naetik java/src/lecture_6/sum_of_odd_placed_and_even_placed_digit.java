package lecture_6;

import java.util.Scanner;

public class sum_of_odd_placed_and_even_placed_digit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt(); 
		
		sum_of_odd_placed_and_even_placed_digit(n);
	}
	public static void sum_of_odd_placed_and_even_placed_digit(int n) {
		int sumodd = 0;
		int sumeven = 0;
		int position = 1;
		while(n>0 ) {
			int rem = n % 10;
			if(position % 2 != 0) { //odd number
				sumodd= sumodd+rem;
			}else {
			sumeven = sumeven + rem;
			}
				n = n/10;
				position++;
			}
	System.out.println(sumodd);
	System.out.println(sumeven);

	
	}
	
}



