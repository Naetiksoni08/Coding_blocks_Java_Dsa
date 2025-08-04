package lecture3forndwhileloop;

public class pattern5 {

	public static void main(String[] args) {
		int row = 1;
		int n = 5;
		int star = n;
		int space = 0;
		while(row<=n) {
		    //space
		  int j = 1;
		  while(j<=space) {
		      System.out.print("   ");
		      j++;
		  }
		  // star
		  int i = 1;
		  while(i<=star) {
		      System.out.print("*  ");
		      i++;
		  }
		  //next row preparation
		  System.out.println();
		  row++;
		  space++;
		  star--;
		  
	 	 }

	}

}
