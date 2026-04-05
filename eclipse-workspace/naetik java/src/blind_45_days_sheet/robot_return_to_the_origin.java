package blind_45_days_sheet;

public class robot_return_to_the_origin {

	public static void main(String[] args) {
		String moves = "UD";
		int x = 0, y = 0;
		for(char ch:moves.toCharArray()) {
			if(ch=='R') x++;
			else if(ch=='L') x--;
			else if(ch=='U') y++;
			else if(ch=='D') y--;
		}
		System.out.println(x==0 && y==0);
	}

}
