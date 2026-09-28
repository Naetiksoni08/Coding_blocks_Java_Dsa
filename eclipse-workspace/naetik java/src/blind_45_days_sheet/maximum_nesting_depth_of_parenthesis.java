package blind_45_days_sheet;

public class maximum_nesting_depth_of_parenthesis {

	public static void main(String[] args) {
		String s = "(1+(2*3)+((8)/4))+1";
		int max = 0;
		int depth = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				depth++;
				max = Math.max(max, depth);
			} else if (c == ')') {
				depth--;
			}
		}
		System.out.println(max); 

	}

}
