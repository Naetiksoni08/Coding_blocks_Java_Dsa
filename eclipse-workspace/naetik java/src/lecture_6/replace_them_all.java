package lecture_6;

import java.util.Scanner;

public class replace_them_all {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		replace_them_all(n);
	}
	public static void replace_them_all(int n ) {
		if (n==0) {
			System.out.println(5);
		} else {
			int result = 0, place =1;
			
			while(n>0) {
				int rem = n%10;
				if(rem==0) {
					rem = 5;
					
				}
				result = result + (rem * place);
				place =place*10;
				n = n/10;
			}
			System.out.println(result);
		}
		
	}
		        

}
