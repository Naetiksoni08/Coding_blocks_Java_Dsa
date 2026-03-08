package blind_45_days_sheet;

public class minimum_operations_to_sort_a_string {
	public static void main(String[] args) {
		String s = "dog";
		if(s.length()==2 &&s.charAt(0)>s.charAt(1)) {
			System.out.println(-1);
		}
		int count = 0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)>s.charAt(i+1)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
