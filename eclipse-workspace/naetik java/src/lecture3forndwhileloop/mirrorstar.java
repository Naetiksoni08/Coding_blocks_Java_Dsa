package lecture3forndwhileloop;

import java.util.Scanner;

public class mirrorstar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // capital s
		int n = sc.nextInt();
		int space = n-1;
		int row = 1;
		int star =1;
		while(row<=2*n-1) {
			//space
			int  i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//star
			int  j = 1;
			while(j<=star) {
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
			}//next row ki prep
			System.out.println();
			row++;
			
		}

	}

}
