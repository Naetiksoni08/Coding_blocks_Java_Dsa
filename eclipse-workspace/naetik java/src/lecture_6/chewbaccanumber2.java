package lecture_6;

import java.util.Scanner;

public class chewbaccanumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		long sum = 0l;
		if(number==90) {
			System.out.println(90);
			return;
		}
		String numberstring = String.valueOf(number);
		for(int i = 0 ;i<numberstring.length(); i++) {
			long digit = numberstring.charAt(i)-'0';
			long founddigit = 9-digit;
			sum*=10;
			if(digit == 9 && i==0) {
				sum+=digit;
			}else if(founddigit<=digit) {
				sum+=founddigit;
				
			}else {
				sum = sum + digit;
			}
		}
		System.out.println(sum);

	}

}
