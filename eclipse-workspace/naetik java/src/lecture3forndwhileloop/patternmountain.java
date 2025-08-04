package lecture3forndwhileloop;

import java.util.Scanner;

public class patternmountain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); // capital s
		int n = sc.nextInt();
			int space = 2*n-3;
			int star = 1;
			int row = 1;
			while(row<=n) {
				//star
				int val = 1;
				int i = 1;
				while(i<=star) {
					System.out.print(val+" ");
					i++;
					val++;

			
				}
				//space
				int j = 1;
				while(j<=space) {
					System.out.print("  ");
					j++;
				}
				
				//star
				int k = row;
				if(row==n) {
					k=row-1;// when the row will be equal to 5 that is n then only if will work 
				}
				
				while(k>=1) {
					System.out.print(k+" ");
					k--;
					val--;
				}
					

				//next row preparations
				System.out.println();
				row++;
				space-=2;       //space = space - 2
				star++;
				
			}

		}

	

}
