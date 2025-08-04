package lecture_6;


import java.util.*;
public class count_of_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int digit = sc.nextInt();
		System.out.println(count_of_digit(n,digit));
		
		

	}
	public static int count_of_digit(int n,int digit) {
		int count =0;
		while(n>0) {
			int rem = n%10;
			if(rem == digit) {	
			count++;
			}
			n = n/10;
		}
		return count;
	}
 
}
