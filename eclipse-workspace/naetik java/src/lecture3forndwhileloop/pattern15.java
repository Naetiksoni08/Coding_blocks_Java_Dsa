package lecture3forndwhileloop;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);	
	int n = sc.nextInt(); 
	int row = 1;
	int star = n;
	int space = 0;
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
		  space +=2;
	  }else {
		  space -=2;
		  star++;
	  }
	  
	  //next row preparation
	  System.out.println();
	  row++;
	  
 	 }

}

}
