package lecture3forndwhileloop;

public class pattern14 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n-1;
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
				star++;
				space--;
			}else {
				star--;
				space++;
			}
			
			//next row preparation
			System.out.println();
			row++;
			
		}
	}

}
