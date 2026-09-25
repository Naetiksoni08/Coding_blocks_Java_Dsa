package blind_45_days_sheet;

import java.util.*;

public class brace_expression_2 {

	private String s;
	private int pos;

	public List<String> braceExpansionII(String expression) {
		s = expression;
		pos = 0;
		Set<String> result = parseExpression();
		List<String> ans = new ArrayList<>(result);
		Collections.sort(ans);
		return ans;

	}

	private Set<String> parseExpression() {
		Set<String> current = new HashSet<>();
		current.add("");
		while (pos < s.length() && s.charAt(pos) != ',' && s.charAt(pos) != '}') {
			Set<String> factor = parseFactor();
			current = cartesianProduct(current, factor);
		}
		return current;
	}

	private Set<String> cartesianProduct(Set<String> a, Set<String> b) {
		Set<String> response = new HashSet<>();
		for (String x : a) {
			for (String y : b) {
				response.add(x + y);
			}
		}

		return response;
	}

	private Set<String> parseFactor() {
		if (s.charAt(pos) == '{') {
			return parseUnion();
		} else {
			StringBuilder sb = new StringBuilder();
			while (pos < s.length() && Character.isLowerCase(s.charAt(pos))) {
				sb.append(s.charAt(pos));
				pos++;
			}
			Set<String> set = new HashSet<>();
			set.add(sb.toString());
			return set;
		}
	}

	private Set<String> parseUnion() {
		pos++;
		Set<String> result = new HashSet<>();
		result.addAll(parseExpression());
		while (pos < s.length() && s.charAt(pos) == ',') {
			pos++;
			result.addAll(parseExpression());
		}
		pos++;
		return result;
	}

}
