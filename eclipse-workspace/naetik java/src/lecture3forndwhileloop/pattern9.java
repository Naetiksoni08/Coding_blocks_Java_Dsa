package lecture3forndwhileloop;

public class pattern9 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n-1 ;
		while(row <= n) {
			//space
			int i = 1;
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
			//space
			while(i<=space) {
				System.out.println("  ");
				i++;
			}	
			//next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
			
		
		
	}

}
