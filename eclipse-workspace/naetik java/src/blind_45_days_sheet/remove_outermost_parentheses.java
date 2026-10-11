package blind_45_days_sheet;

public class remove_outermost_parentheses {

	public static void main(String[] args) {
		String s = "(()())(())";
		StringBuilder sb = new StringBuilder();
		int depth = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				if (depth > 0)
					sb.append(ch);
				
				depth++;
			}else {
				depth--;
				if(depth>0) sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}

}
