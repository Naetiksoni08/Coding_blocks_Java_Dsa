package lecture3forndwhileloop;

public class pattern10 {

	public static void main(String[] args) {
		
			int n = 5;
			int row = 1;
			int star = 2*n-1;
			int space = 0 ;
			while(row <= n) {
				//space
				int i = 0;
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
				//next row preparation
				System.out.println();
				row++;
				star-=2;
				space++;
			}
				
			
			
	}

}
