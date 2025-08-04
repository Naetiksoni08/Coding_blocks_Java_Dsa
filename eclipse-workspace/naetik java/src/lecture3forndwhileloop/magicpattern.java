package lecture3forndwhileloop;

import java.util.Scanner;

public class magicpattern {

	public static void main(String[] args) {
		Scanner naetik = new Scanner(System.in);
		int n = naetik.nextInt();
		int space = -1;
		int row = 1;
		int star = n;
		while(row<=2*n-1) {
			//star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//space
			int j =1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			//star
			int k = 1;
			if(row==1) {
				k=2;
			}
			while(k<=star) {
				if (row == 2 * n - 1 && k == star) { // added condition  
		              break;  
		    }  
				System.out.print("* ");
				k++;
			}
			//mirroring
			if(row<n) {
				star--;
				space+=2;
			}else {
				star++;
				space-=2;
			}
			
		System.out.println();
		row++;
	}

}

}



