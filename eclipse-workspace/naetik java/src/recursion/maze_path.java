package recursion;

public class maze_path {

	public static void main(String[] args) {
		int n = 3; // row
		int m = 4; // col
		print(n-1, m-1 , 0 , 0,"");
				

	}
	public static void print(int er , int ec, int cr , int cc, String ans) {
		// er = end row
		//ec  = end col
		//cr = current row
		// cc = current col
		if (cc == ec && cr == er) {
			System.out.println(ans);
			return;
		}
		if(cc>ec || cr>er) {
			return;
		}
		print(er ,ec , cr , cc+1, ans+"H" );
		print(er ,ec , cr+1 , cc, ans+"V" );
	}

}
