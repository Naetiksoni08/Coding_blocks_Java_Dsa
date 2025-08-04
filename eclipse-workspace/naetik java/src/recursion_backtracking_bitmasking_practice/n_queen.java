package recursion_backtracking_bitmasking_practice;

public class n_queen {

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		queen(board, n, 0);
		

	}

	public static void queen(boolean[][] board, int tq, int row) {
		if(tq==0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board.length; col++) {
          if(isitsafe(board,tq,row, col) == true) {
        	  board[row][col]=true;
              queen(board,tq-1,row+1);
              board[row][col] = false; // backtracking
        	  }
		}
	}

	public static boolean isitsafe(boolean[][] board, int tq, int row,int col) {
		//up
		int r = row;
		while(r>=0) {
			if(board[r][col]==true) {
				return false;
			}
			r--;
			
		}
		//left
		r = row;
		int c = col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
				
			}
			r--;
			c--;
		}
		//right
		r =row;
		c = col;
		while(r>=0 && c<board.length) {
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
		
	}

	public static void Display(boolean[][] board) {
		for(int i = 0 ; i<board.length; i++) {
			for(int j = 0 ; j<board.length; j++) {
				System.out.print(board[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}
}