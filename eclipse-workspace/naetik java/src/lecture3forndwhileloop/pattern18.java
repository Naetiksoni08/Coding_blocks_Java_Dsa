package lecture3forndwhileloop;

import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int n = sc.nextInt();
			int row = 1;
			int star = 1;
			int space = n;
			while(row <= 2*n-1) {
				//space
				int i = 1;
				while(i <= space) {
					System.out.print("  ");
					i++;
				}
				//star
				int j = 1;
				while(j <= star) {
					System.out.print("* ");
					j++;
				}
				//mirroring
				if(row<n) {
					star+=2;
					space--;
				}else {
					star-=2;
					space++;
				}
					
				//next row preparation
				System.out.println();
				row++;
			}
				
	}

}
