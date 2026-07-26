package blind_45_days_sheet;

public class maximum_product_subarray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, -2, 4 };
		int maxend = arr[0];
		int minend = arr[0];
		int ans = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			 int num = arr[i];
			 
			 int maxtemp = Math.max(num, Math.max(maxend*num, minend*num));
			 int mintemp = Math.min(num, Math.min(maxend*num, minend*num));
			 maxend  = maxtemp;
			 minend = mintemp;
			 ans = Math.max(ans, maxend);
		}
		System.out.println(ans);
	}

}
