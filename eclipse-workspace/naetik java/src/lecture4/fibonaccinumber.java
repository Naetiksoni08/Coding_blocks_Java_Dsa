package lecture4;

import java.util.Scanner;

public class fibonaccinumber {


		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in); // capital s
			int k = sc.nextInt(); 
			int a = 0;
			int b = 1;
			int row = 1;
			int count = 1;
			while(row <= k) {
				int  i= 1;
				while(i<= row) {
					System.out.print(a + "\t");
					
					int next = a+b;
					a=b;
					b=next;
					
					i++;
				}
				//next row preparation
				System.out.println();
				row++;
				
			}
			

		}

	}
