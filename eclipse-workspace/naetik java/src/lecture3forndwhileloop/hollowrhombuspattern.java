package lecture3forndwhileloop;

import java.util.Scanner;

public class hollowrhombuspattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // capital s
		int n = sc.nextInt();
		int space = n-1;
		int row = 1;
		int star = n;
		while(row<=n) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			//star
			int j = 1;
			while(j<=star) {
				if(row==1 || row==n || j==1 ||j==star) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			row++;
			space--;
			
			
		}

	}

}



////Stars are printed in the first row (row == 1).
//Stars are printed in the last row (row == n).
//Stars are printed in the first column of each row (j == 1).
//Stars are printed in the last column of each row (j == star).
