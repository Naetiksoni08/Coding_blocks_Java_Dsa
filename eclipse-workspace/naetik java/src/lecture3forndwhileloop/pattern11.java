package lecture3forndwhileloop;

public class pattern11 {


	public static void main(String[] args) {
		int n = 6;
		int row =1;
		int star = 1;
		int space = n-1;
		while(row<=n) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
			//star
			int j = 1;
			while(j<=star) {
				if(j%2==0) {
					System.out.print("*  ");
				}else {
					
					System.out.print("   ");
				}
				j++;
			}
			//next row preparation
			System.out.println();
			row++;
			star += 2;
			space--;
			
		}

	}

}
