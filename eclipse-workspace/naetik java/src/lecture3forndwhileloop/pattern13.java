package lecture3forndwhileloop;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt(); 
		int row = 1;
		int star =1;
		while(row <= 2*n-1) { // why 2*n-1 because we want that the stars should 
			                  //should increase first and then decrease 9 stars vertically
			//star
			int  i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			//mirroring
			if(row<n) {
				star++;
			}else {
				star--;
			}
			//next row preparation
			System.out.println();
			row++;

		}
		

	}

}
