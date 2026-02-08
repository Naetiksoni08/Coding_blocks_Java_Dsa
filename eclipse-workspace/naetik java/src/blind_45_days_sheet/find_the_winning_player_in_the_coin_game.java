package blind_45_days_sheet;

public class find_the_winning_player_in_the_coin_game {
	public static void main(String[] args) {
		int x = 2;
		int y = 7;
		int moves=0;
		moves=Math.min(x, y/4);
		if(moves%2!=0) { // that means odd hai 
			System.out.println("Alice");
		}
		else {
			System.out.println("Bob");
		}
	}
// we have to any how make 115 so the choice we have is a=1 and b=4 thats it 
}
