package recursion_backtracking_bitmasking_practice;

public class n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		n_queen(board, n, 0);
	}

	public static void n_queen(boolean[][] board, int tq, int row) {
		if(tq==0) {
			Display(board);
			System.out.println();
			return;
			
		}
		for (int col = 0; col < board[0].length; col++) {
			if(isitsafe(board,row,col)==true) {
				board[row][col] = true;
				n_queen(board,tq-1,row+1);
				board[row][col] =false;
			}
		}
	}

	public static void Display(boolean[][] board) {
		for(int row = 0; row<board.length; row++) {
			for(int col = 0;col<board[0].length; col++) {
				System.out.print(board[row][col]+" ");
			}
			System.out.println();
		}
		
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		//up
		int r = row;
		while(r>=0) {
			if(board[r][col]==true) {
				return false;
			}
			r--;
		}
		//left diagnal
		 r = row;
		int c = col;
		while(r>=0 &&c>=0) {
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c--;
			
		}
		c = col;
		r = row;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]==true) {
				return false;
			}
			c++;
			r--;
		}
		return true;
		
	}
	

}
