package recursion_backtracking_bitmasking_practice;

public class math_path {

	public static void main(String[] args) {
		int m = 3; // row
		int n = 3; // column
		mathpath(0,0,n-1, m-1, "");
	   

	}
	// cc- current col
	// current row
	// end column
	// end row
	public static void mathpath(int cc , int cr , int ec,int er, String ans ) {
		if(cc == ec && cr == er) {
			System.out.println(ans);
			return;
		}
		if(cc>ec || cr>er) {
			return;
		}
		mathpath(cc+1,cr,ec,er,ans+"H");
		mathpath(cc,cr+1,ec,er,ans+"V");
		
		
	}

}
