package blind_45_days_sheet;

public class maximum_number_of_words_found_in_a_sentence {
	public static void main(String[] args) {
		String [] sentences= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int max = 0;
		for(String sentence:sentences) {
			int count = sentence.split(" ").length;
			max = Math.max(max, count);
		}
		System.out.println(max);
	}


}
