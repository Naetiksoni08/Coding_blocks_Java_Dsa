package recursion_backtracking_bitmasking_practice;

public class queen_permutation {

	public static void main(String[] args) {
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		queen(board, tq,"", 0);
		System.out.println(count);

	}
 static int count = 0;
	public static void queen(boolean[] board, int tq,String ans ,int qpsf) {
		if(qpsf == tq) {
			System.out.println(ans);
			count++;
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if(board[i] == false) { // already agar koi queen bethi hui hai toh loop mai chalega isliye check karnege ki koi bethi toh nai hai 
				board[i] = true;
				queen(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1);
				board[i] = false;
			}

		}
	}

}
