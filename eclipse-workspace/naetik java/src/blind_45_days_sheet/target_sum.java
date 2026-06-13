package blind_45_days_sheet;

public class target_sum {
	public static int count = 0;

	public static void main(String[] args) {
		int[] arr = { 1 };
		int target = 1;
		count = 0; // reset karo 
		targetsum(arr, target, 0, 0);
		System.out.println(count);
	}

	public static void targetsum(int[] arr, int target, int i, int sum) {
		if (arr.length == i) {
			if (sum == target) {
				count++;
			}
			return;
		}
		targetsum(arr, target, i + 1, sum + arr[i]); // +
		targetsum(arr, target, i + 1, sum - arr[i]); // -
	}

}

//
//Test case 1:
//	  count = 0  ← reset!
//	  recursion chali → count = 5
//	  return 5 ✓
//
//	Test case 2:
//	  count = 0  ← reset! (5 se wapas 0!)
//	  recursion chali → count = 1
//	  return 1 ✓
//Static variable → class ke saath rehta hai, function khatam hone ke baad bhi! Isliye manually reset karo ya local variable use karo! 🎯