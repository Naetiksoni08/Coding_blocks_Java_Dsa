package assignment_questions;
import java.util.*;

public class maze_path2 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // rows
		int M = sc.nextInt(); // columns
		mathpath(0,0,N-1, M-1, "");
		System.out.println();
		System.out.println(count);
	   

	}
	// cc- current col
	// current row
	// end column
	// end row
	static int count = 0;
	public static void mathpath(int cc , int cr , int ec,int er, String ans ) {
		if(cc == ec && cr == er) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if(cc>ec || cr>er) {
			return;
		}
		mathpath(cc+1,cr,ec,er,ans+"V");
		mathpath(cc,cr+1,ec,er,ans+"H");
		
		
	}

}



