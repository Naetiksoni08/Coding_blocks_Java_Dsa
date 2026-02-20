package blind_45_days_sheet;

public class reverse_string_prefix {
	public static void main(String[] args) {
		String s = "abcd";
		int k = 2;
		char[]arr = s.toCharArray();
		int i = 0;
		int j = k-1;
		while(i<j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println(new String(arr));
	}
	
	
	

}
