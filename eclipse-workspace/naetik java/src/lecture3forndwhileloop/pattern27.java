package lecture3forndwhileloop;

public class pattern27 {

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
				int val = 1;
				int j = 1;
				while(j <= star) {
					System.out.print(val+" ");
					if(j<=star/2) {
						val++;
					}else {
						val--;
					}
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
