package lecture4;

import java.util.Scanner;

public class pattern0 {

			public static void main(String[] args) {
				Scanner sc= new Scanner(System.in); // capital s
				int n = sc.nextInt(); 
				int row = 1;
				int star =1;
				int a = 1;
				int b = 2;
				while(row <= n) {
					//star
					int  i = 1;
					while(i <= star) {
						System.out.print(a+ "  ");
						i++;
				        a++;
					}
					//next row preparation
					System.out.println();
					row++;
					star++;
				}

	}

}
