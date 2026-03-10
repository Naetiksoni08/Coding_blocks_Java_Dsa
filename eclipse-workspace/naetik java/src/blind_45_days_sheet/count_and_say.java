package blind_45_days_sheet;

public class count_and_say {
	
	public static void main(String[] args) {
		int n = 4;
		String ans = "1";
		for (int i = 1; i < n; i++) {
			int count = 1;
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j < ans.length(); j++) {
				if(ans.charAt(j)==ans.charAt(j-1)) {
					count++;
					
				}else {
					sb.append(count);
					sb.append(ans.charAt(j-1));
					count = 1;
				}
			}
			sb.append(count);
			sb.append(ans.charAt(ans.length()-1));
			ans = sb.toString();
		}
		System.out.println(ans);
	}


}
