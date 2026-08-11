package blind_45_days_sheet;

import java.util.*;

public class fizz_buzz {

	public static void main(String[] args) {
		int n = 3;
		List<String> answer = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				answer.add("FizzBuzz");
			} else if (i % 3 == 0) {
				answer.add("Fizz");
			} else if (i % 5 == 0) {
				answer.add("Buzz");
			} else {
				answer.add(String.valueOf(i));
			}
		}
//		 return answer;

	}

}
