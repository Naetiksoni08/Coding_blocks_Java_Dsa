package lecture_6;

import java.util.Scanner;

public class replacethemall {

			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				long number = sc.nextLong(); 
				long sum = 0L; 
				String numberString = String.valueOf(number); 

				// Traverse each character of the string
				for (int i = 0; i < numberString.length(); i++) {
					long digit = numberString.charAt(i) - '0'; 
					
					sum= sum*10;

					
					if (digit == 0) {
						sum = sum + 5;
					} else {
						sum = sum + digit;
					}
				}
				
				System.out.println(sum);
			}
		}
