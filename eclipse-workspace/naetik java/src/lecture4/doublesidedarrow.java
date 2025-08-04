package lecture4;

import java.util.Scanner;

public class doublesidedarrow {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // capital s
		int n = sc.nextInt(); 
		int initialspaces = n-1;
		int middlespaces=-1;
		int row = 1;
		while(row<=n) {
			//spaces
			int space=0;
			while(space<initialspaces) {
				System.out.print("  ");
				space++;
			    
			}
			//print the first half numbers
			int starternumber=initialspaces;
			while(space>0) {
				System.out.print(starternumber+" ");
				starternumber--;
			}
			
			
		}
	}

}
