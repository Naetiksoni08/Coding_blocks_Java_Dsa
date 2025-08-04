package lecture3forndwhileloop;

public class pattern21 {

	public static void main(String[] args) {
		int n  = 5;
		int space = 2*n-3;
		int star = 1;
		int row = 1;
		int val = 1;
		while(row<=n) {
			//star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;

		
			}
			//space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			
			//star
			int k = 1;
			if(row==n) {
				k=2;// when the row will be equal to 5 that is n then only if will work 
			}
			
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			//next row preparations
			System.out.println();
			row++;
			space-=2;       //space = space - 2
			star++;
		}

	}

}
