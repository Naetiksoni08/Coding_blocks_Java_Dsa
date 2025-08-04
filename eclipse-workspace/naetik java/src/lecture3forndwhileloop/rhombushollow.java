package lecture3forndwhileloop;

import java.util.Scanner;

public class rhombushollow {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // capital s
		int n = sc.nextInt();
		int row  = 1;
		int space = n-1;
		int star =1;
		int val = 1; // this will tell us from where  each the row is starting 
		while(row<=2*n-1) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("  \t");
				i++;
			}
			//star
			int j = 1;
			int p = val;
			while(j<=star) {
				System.out.print(p+" \t");
				if(j<=star/2) {
					p++;
				}else {
					p--;
				}
				
				j++;
			}
			//mirroring
			if(row<n) {
				star+=2;
				space--;
				val++;
				
			}else {
				star-=2;
				space++;
				val--;
			}
		//next row ki prep
		System.out.println();
		row++;
		}
	}

}
