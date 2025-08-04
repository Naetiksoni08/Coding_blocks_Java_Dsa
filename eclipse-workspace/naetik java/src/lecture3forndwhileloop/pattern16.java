package lecture3forndwhileloop;

public class pattern16 {
public static void main(String[] args) {
					int row = 1;
					int n = 5;
					int star = n;
					int space = n-1;
					while(row<=2*n-1) {
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
					  //mirroring 
					  if(row<n) {
					      star--;
					      space-=1;
					  }else{
					      star++;
					      space+=1;
					  }
					  //next row preparation
					  System.out.println();
					  row++;
					  
					  
		 }

	}

}
