package backtracking_recursion;

public class queen_permutation {

	public static void main(String[] args) {
		int n = 4;
		int tq  = 2; // total queen
		boolean [] board = new boolean[n];
		permutation(board,tq,0,"");
		

	} // qpsf = queen placed so far 
	public static void permutation(boolean [] board, int tq,int qpsf,String ans) {
		if(tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i = 0; i<board.length; i++) {
			if(board[i] == false) { // queen bethi toh nai h 
				board[i] = true; // queen sat 
				permutation(board, tq , qpsf+1, ans+"b"+i+"q"+qpsf);
				board[i] = false; // backtracking // undo 
			
		}
  	}

	}
}
// recursion undo nai karva pa raha toh hum usse forcefully undo karenge jaise true ko false nai kar pa raha recursion qpsf ands ko kar raha h but call se phele kuch aise likha humne jo recusion undo nai karva pa raha toh hum forcefully karenge undo usse
