package blind_45_days_sheet;

public class Word_search_leetcode {

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) { // call tabhi jayega jab board ka i,j is equal to the 1st character
														// of the word
					boolean ans = wordsearch(board, i, j, word, 0);
					if (ans == true) {
						System.out.println(ans);
						return;
					}
				}

			}

		}
		System.out.println(false);

	}

	// agar col is less than 0 or row is less
	// than 0 or cc range sai bhar hogaya ya
	// fir row range sai bhar hogaya toh fir
	// return false
	// if word ka character mismatch karta hai baord ke character sai toh fir return
	// false
	public static boolean wordsearch(char[][] board, int cr, int cc, String word, int idx) {
		if (idx == word.length()) {
			return true;
		}
		if (cc < 0 || cr < 0 || cc >= board[0].length || cr >= board.length || word.charAt(idx) != board[cr][cc]) {
			return false;
		}
		board[cr][cc] = '*';
		int[] row = { -1, 0, 1, 0 };
		int[] col = { 0, -1, 0, 1 };
		for (int i = 0; i < col.length; i++) {
			boolean ans = wordsearch(board, cr + row[i], cc + col[i], word, idx + 1);
			if (ans == true) {
				return true;
			}
		}
		board[cr][cc] = word.charAt(idx); // backtrack karenge toh fir vohi character joh pick kia tha usse vapas return
											// false karnai sai phele * -> vohi character rakhdenge
		return false;
	}

}
//int[] row = { -1, 0, 1, 0, -1, -1, 1, 1 };
//int[] col = { 0, -1, 0, 1, 1, -1, 1, -1 }; for 8 directions 

