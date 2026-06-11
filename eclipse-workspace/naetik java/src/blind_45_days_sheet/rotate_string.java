package blind_45_days_sheet;

public class rotate_string {

	public static void main(String[] args) {
		String s = "abcde", goal = "cdeab";
		if (s.length() != goal.length()) {
			System.out.println(false);
		}
		
		System.out.println((s+s).contains(goal));

	} 
	// so whole idea was ki agar s+s ke andar goal exist karta hai as a subsstring then true else false 
	// why s+s becuase s+s mai sari shifts aah jati hai 
}
// order of n linear time
// order of 1 is constant time

