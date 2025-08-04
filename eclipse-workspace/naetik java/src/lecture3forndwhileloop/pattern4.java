package lecture3forndwhileloop;

public class pattern4{
	public static void main(String[] args) {
		int n = 5;
		int space = n-1;
		int star = 1;
		int row = 1;
		while( row<= n) {
		    //space
		    int i = 1;
		    while( i <= space) {
		        System.out.print("  ");
		        i++;
		    }
		    //star
		    int j = 1;
		    while(j <= row) {
		        System.out.print("* ");
		        j++;
		    }
		    // next row preparation 
		    System.out.println();
		    row++;
		    space--;
		    star++;
		    
		}
	}
}



