package lecture3forndwhileloop;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // capital s
		int n = sc.nextInt(); 
		int row = 1;
		int star =1;
		while(row <= n) {
			//star
			int  i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			//next row preparation
			System.out.println();
			row++;
			star++;
		}
		

	}

}
