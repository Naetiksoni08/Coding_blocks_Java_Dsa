package backtracking_recursion;

public class queen_combination {

	public static void main(String[] args) {
		int n = 4;
		int tq  = 2; // total queen
		boolean [] board = new boolean[n];
		combination(board,tq,0,"",0);
		

	} // qpsf = queen placed so far 
	public static void combination(boolean [] board, int tq,int qpsf,String ans,int idx) {
		if(tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i = idx; i<board.length; i++) {
			if(board[i] == false) { // queen bethi toh nai h 
				board[i] = true; // queen sat 
				combination(board, tq , qpsf+1, ans+"b"+i+"q"+qpsf,i+1);
				board[i] = false; // backtracking // undo 
			
		}
  	}

	}

}
